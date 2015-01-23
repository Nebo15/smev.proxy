package ru.synq.smev;

import org.springframework.data.domain.Page;

import java.util.List;

public class Response {
    public static ErrorResponse error(Exception exception) {
        return new ErrorResponse(exception.getClass().getName(), exception.getMessage());
    }

    public static PageResponse page(Page page) {
        return new PageResponse(page);
    }

    public static class ErrorResponse {
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