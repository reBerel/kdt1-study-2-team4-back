package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://127.0.0.1:8080",
                        "http://localhost:8080",
                        "http://3.104.119.171",
                        "http://ec2-3-104-119-171.ap-southeast-2.compute.amazonaws.com/")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
