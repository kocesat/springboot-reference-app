package com.hoaxify.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthEntryPoint implements AuthenticationEntryPoint {
//    @Override
//    public void commence(
//            HttpServletRequest request,
//            HttpServletResponse response,
//            AuthenticationException authException)
//            throws IOException, ServletException {
//        response.setContentType("application/json;charset=UTF-8");
//        response.sendError(
//                HttpStatus.UNAUTHORIZED.value(),
//                HttpStatus.UNAUTHORIZED.getReasonPhrase()
//        );
//    }

    @Autowired
    @Qualifier("handlerExceptionResolver")
    private HandlerExceptionResolver resolver;


    @Override
    public void commence(
            HttpServletRequest request,
            HttpServletResponse response,
            AuthenticationException authException)
            throws IOException, ServletException {
        resolver.resolveException(request, response, null, authException);
    }
}
