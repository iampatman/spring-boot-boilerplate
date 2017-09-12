package com.sympatica;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.joda.time.LocalTime;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan
public class Application {
    @RequestMapping("/")
    String hello() {
        return "hello world";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: 123 " + currentTime);


    }


}
