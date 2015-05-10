/*
 * Copyright (c) 2014, CreditPilot.
 */

package ru.synq.smev;

import com.sun.xml.bind.v2.runtime.IllegalAnnotationException;
import com.sun.xml.bind.v2.runtime.IllegalAnnotationsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.WebServiceException;
import java.io.IOException;

import static java.lang.String.format;
import static ru.synq.smev.Response.error;


@ControllerAdvice
public class RestExceptionHandler {

    public final Logger log = LoggerFactory.getLogger(RestExceptionHandler.class);

    @RequestMapping
    @ExceptionHandler({
            MissingServletRequestParameterException.class,
            HttpMessageNotReadableException.class,
            UnsatisfiedServletRequestParameterException.class,
            HttpRequestMethodNotSupportedException.class,
            ServletRequestBindingException.class,
            TypeMismatchException.class
    })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody
    Response handleRequestException(Exception ex) {
        log.debug("Bad request: {}", ex.getMessage());
        return error(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @RequestMapping
    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody
    Response handleException(BindException ex) {
        log.debug("Bad request: {}", ex.getMessage());
        return error(HttpStatus.BAD_REQUEST, formatBindingResult(ex.getBindingResult()));
    }

    private String formatBindingResult(BindingResult bindingResult) {
        String message = "Validation errors:";
        for (FieldError error : bindingResult.getFieldErrors()) {
            message += format(" field %s: ", error.getField());
            if (error.getRejectedValue() == null) {
                message += "reject empty value";
            } else {
                message += "reject value: "+error.getRejectedValue();
            }
            if (error.getDefaultMessage() != null && !error.getDefaultMessage().isEmpty()) {
                message += ", "+error.getDefaultMessage();
            }
            message += ";";
        }
        return message;
    }

    @RequestMapping
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public @ResponseBody
    Response handleValidationException(MethodArgumentNotValidException ex) throws IOException {
        log.debug("Invalid request: {}", ex.getMessage());
        return error(HttpStatus.UNPROCESSABLE_ENTITY, formatBindingResult(ex.getBindingResult()));
    }

    @RequestMapping
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    public @ResponseBody
    Response handleUnsupportedMediaTypeException(HttpMediaTypeNotSupportedException ex) throws IOException {
        log.debug("Unsupported media type: {}", ex.getMessage());
        return error(HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    @RequestMapping
    @ExceptionHandler(SecurityException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public @ResponseBody
    Response handleUncaughtException() throws IOException {
        log.error("Unauthorized");
        return error(HttpStatus.UNAUTHORIZED);
    }

    @RequestMapping
    @ExceptionHandler(WebServiceException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody
    Response handleIllegalAnnotationsException(WebServiceException ex) throws IOException {
        IllegalAnnotationsException aEx = null;
        Throwable cause = ex.getCause();
        while (cause != null && aEx == null) {
            if (cause instanceof IllegalAnnotationsException) {
                aEx = (IllegalAnnotationsException) cause;
            } else {
                cause = cause.getCause();
            }
        }
        if (aEx != null) {
            String message = "JAXB validation error:";
            for (IllegalAnnotationException exception : aEx.getErrors()) {
                message += "\n" + exception.getMessage();
            }
            log.error(message);
            return error(HttpStatus.INTERNAL_SERVER_ERROR, message);
        } else {
            return handleUncaughtException(ex);
        }
    }

    @RequestMapping
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody
    Response handleUncaughtException(Exception ex) throws IOException {
        log.error("Uncaught exception: ", ex);
        return error(ex);
    }
}
