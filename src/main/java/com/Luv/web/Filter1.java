package com.Luv.web;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter("/index.jsp")
public class Filter1 implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
<<<<<<< HEAD
=======
        System.out.println("Filter");
>>>>>>> origin/main

        chain.doFilter(request, response);
    }
}
