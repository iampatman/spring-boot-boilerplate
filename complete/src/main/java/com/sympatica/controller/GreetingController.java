package com.sympatica.controller;

import com.sympatica.entity.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private Environment env;

    @RequestMapping(method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        System.out.println();
        System.out.println(env.getProperty("server.url"));
        for (final String profileName : env.getActiveProfiles()) {
            System.out.println("Currently active profile - " + profileName);
        }
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Greeting postgreeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format("POST NEW NNAME %s", name));
    }
}
