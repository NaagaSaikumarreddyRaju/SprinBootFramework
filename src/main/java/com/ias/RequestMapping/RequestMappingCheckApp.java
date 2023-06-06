package com.ias.RequestMapping;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class RequestMappingCheckApp {
    public static void main(String[] args) {
        SpringApplication.run(RequestMappingCheckApp.class, args);
    }
}
