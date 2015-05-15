package ru.synq.smev;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationFilter implements Filter {
    private static Logger log = LoggerFactory.getLogger(AuthenticationFilter.class);

    @Value("${api.key}") String key;
    @Value("${api.secret}") String secret;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired ObjectMapper objectMapper;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        final String api_keyParam = request.getParameter("api_key");
        final String api_secretParam = request.getParameter("api_secret");
        if (!key.equals(api_keyParam) || !secret.equals(api_secretParam)) {
            HttpServletResponse res = (HttpServletResponse) response;
            res.setContentType(MediaType.APPLICATION_JSON_VALUE);
            res.setStatus(HttpStatus.UNAUTHORIZED.value());
            objectMapper.writeValue(res.getWriter(), Response.error(HttpStatus.UNAUTHORIZED));
//            log.warn("Unauthorized with key:{}, secret:{}", api_keyParam, api_secretParam);
        } else {
            // через FilterChain не работает почему-то
            new RequestInputStreamBufferFilter().doFilter(request, response, chain);
        }
    }

    @Override
    public void destroy() {

    }
}
