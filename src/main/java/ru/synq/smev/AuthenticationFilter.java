package ru.synq.smev;

import com.fasterxml.jackson.databind.ObjectMapper;
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

    @Value("${api.key}") String key;
    @Value("${api.secret}") String secret;

    @Autowired ObjectMapper objectMapper;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (!key.equals(request.getParameter("api_key"))
                || !secret.equals(request.getParameter("api_secret"))) {
            HttpServletResponse res = (HttpServletResponse) response;
            res.setContentType(MediaType.APPLICATION_JSON_VALUE);
            res.setStatus(HttpStatus.UNAUTHORIZED.value());
            objectMapper.writeValue(res.getWriter(), Response.error(HttpStatus.UNAUTHORIZED));
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
