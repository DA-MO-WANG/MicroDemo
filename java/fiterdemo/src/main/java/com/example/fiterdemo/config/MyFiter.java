package com.example.fiterdemo.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyFiter implements Filter {
    //@Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
        //Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        long start = System.currentTimeMillis();
        System.out.println("在web方法执行之前经过");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("在web方法执行完返回时经过");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
