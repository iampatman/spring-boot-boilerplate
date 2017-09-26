package com.sympatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.joda.time.LocalTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    String hello() {
        return "hello world";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: 123 " + currentTime);



    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("BEFORE START");
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    };


}
