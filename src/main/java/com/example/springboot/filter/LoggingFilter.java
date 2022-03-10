package com.example.springboot.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@Component
@Order(2)
public class LoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        System.out.println("Inside first filter");
//        System.out.println("Request URI = " + httpRequest.getRequestURI());
//        System.out.println("Params = " + httpRequest.getParameter("email"));
//        System.out.println("Request Method = " + httpRequest.getMethod());

        chain.doFilter(request, response);
    }
}
