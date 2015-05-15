package ru.synq.smev;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;

/**
 * Фильтр кеширующий тело запроса (request.inputStream) для множественного срабатывания анотации @RequestBody в одном методе
 */
public class RequestInputStreamBufferFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(new RequestWrapper((HttpServletRequest) request), response);
    }

    @Override
    public void destroy() {

    }

    private static class RequestWrapper extends HttpServletRequestWrapper {
        private BufferedServletInputStream buffered;

        public RequestWrapper(HttpServletRequest request) {
            super(request);
        }

        @Override
        /**
         * возвращаем сохранённое тело запроса
         */
        public ServletInputStream getInputStream() throws IOException {
            if (buffered == null)
                buffered = new BufferedServletInputStream(super.getInputStream());
            return buffered;
        }
    }
}
