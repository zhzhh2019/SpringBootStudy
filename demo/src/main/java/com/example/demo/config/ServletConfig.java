package com.example.demo.config;


import com.example.demo.ServletTest.ServletTest2;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringBoot 整合 Servlet  方式 2
 *
 * 1
 * 创建 ServletConfig 类，加上注解 @Configuration  表明这是个配置类，Spring会加载并实例
 *
 * */

@Configuration
public class ServletConfig {



        /**
         * 完成Servlet 组件 注册
         * */
        @Bean
        public ServletRegistrationBean getServletRegistrationBean(){
            ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new ServletTest2());
            servletRegistrationBean.addUrlMappings("/servlettest2");
            return servletRegistrationBean;
        }


}
