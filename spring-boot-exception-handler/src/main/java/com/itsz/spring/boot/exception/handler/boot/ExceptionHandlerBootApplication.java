package com.itsz.spring.boot.exception.handler.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.itsz.spring.boot.exception.handler.boot",
        "com.itsz.spring.boot.exception.handler.user.controller",
        "com.itsz.spring.boot.exception.handler.user.service"
})
public class ExceptionHandlerBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionHandlerBootApplication.class);
    }
}
