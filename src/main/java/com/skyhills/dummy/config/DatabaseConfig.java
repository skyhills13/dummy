package com.skyhills.dummy.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by soeunpark on 2017. 5. 16..
 */
@Configuration
@EnableJpaRepositories(
        basePackages = "com.skyhills.dummy.repository"
)
@EnableTransactionManagement
public class DatabaseConfig {

    @Bean
    public ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
        registration.addUrlMappings("/h2/*");
        registration.addInitParameter("webAllowOthers", "true");
        return registration;
    }
}