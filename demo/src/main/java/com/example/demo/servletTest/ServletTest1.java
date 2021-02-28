package com.example.demo.servletTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * SpringBoot 整合  Servlet 方式一
 *
 * 1、Servlet 类上加上注解 @WebServlet
 * 2、在Sprinboot的启动类上加上注解 @ServletComponentScan
 * */
@WebServlet(name="ServletTest1",urlPatterns = "/servlettest1")
public class ServletTest1  extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.err.println("servlettest1");
    }
}
