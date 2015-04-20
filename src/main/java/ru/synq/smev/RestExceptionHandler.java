/*
 * Copyright (c) 2014, CreditPilot.
 */

package ru.synq.smev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

import static ru.synq.smev.Response.error;


@ControllerAdvice
public class RestExceptionHandler {

    public final Logger log = LoggerFactory.getLogger(RestExceptionHandler.class);

    @RequestMapping
    @ExceptionHandler({BindException.class,
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
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public @ResponseBody
    Response handleValidationException(MethodArgumentNotValidException ex) throws IOException {
        log.debug("Invalid request: {}", ex.getMessage());
        final List<FieldError> errors = ex.getBindingResult().getFieldErrors();
        if (errors.isEmpty()) {
            return error(HttpStatus.UNPROCESSABLE_ENTITY);
        } else {
            return error(HttpStatus.UNPROCESSABLE_ENTITY, errors.get(0).getDefaultMessage());
        }
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
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody
    Response handleUncaughtException(Exception ex) throws IOException {
        log.error("Uncaught exception: ", ex);
        return error(ex);
    }
}
