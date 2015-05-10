package ru.synq.smev;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

import java.util.List;

public class Response {
    public Object data;

    public Response(Object data) {
        this.data = data;
    }

    public Response() {
    }

    public static ErrorResponse error(Exception exception) {
        return new ErrorResponse(exception.getClass().getName(), exception.getMessage()+causeToString(exception));
    }

    private static String causeToString(Throwable e) {
        if (e.getCause() ==  null) return "";
        String s = e.getClass().getSimpleName();
        String message = e.getLocalizedMessage();
        return " < " + (message != null ? message : s)
                + (e.getCause().getLocalizedMessage() != null && !e.getCause().getLocalizedMessage().equals(message) ? causeToString(e.getCause()) : "");
    }

    public static PageResponse page(Page page) {
        return new PageResponse(page);
    }

    public static ErrorResponse error(HttpStatus status) {
        return new ErrorResponse(String.valueOf(status.value()), status.getReasonPhrase());
    }

    public static ErrorResponse error(HttpStatus status, String message) {
        return new ErrorResponse(String.valueOf(status.value()), message);
    }

    public static Response data(Object data) {
        return new Response(data);
    }

    public static class ErrorResponse extends Response {
        public final String error;
        public final String message;

        public ErrorResponse(String error, String message) {
            this.error = error;
            this.message = message;
        }
    }

    public static class PageResponse {
        public final List data;
        public final long totalElements;
        public final int pageSize;

        public PageResponse(Page page) {
            data = page.getContent();
            totalElements = page.getTotalElements();
            pageSize = page.getSize();
        }
    }
}
