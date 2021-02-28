package com.example.demo.ServletTest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * SpringBoot 整合  Servlet 方式二
 *
 * 1、在config/目录中创建 ServletConfig类 并使用注解@Configuration 标注类
 * 2、在config类中创建 Servlet获取方法返回参数：ServletRegistrationBean ，并使用 @@Bean 注解
 *完成Servlet 组件 注册
 *@Bean
 *public ServletRegistrationBean getServletRegistrationBean(){
        *ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(new ServletTest2());
        *servletRegistrationBean.addUrlMappings("/servlettest2");
        *return servletRegistrationBean;
        *}
 *
 * */

public class ServletTest2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.err.println("servlettest2");
    }
}
