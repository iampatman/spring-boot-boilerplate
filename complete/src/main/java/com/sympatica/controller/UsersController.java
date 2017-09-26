package com.sympatica.controller;

import com.sympatica.entity.ApplicationUser;
import com.sympatica.entity.UserDTO;
import com.sympatica.entity.Greeting;
import com.sympatica.DataAccess.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by NguyenTrung on 12/9/17.
 */
@RestController
@RequestMapping(value = "/users")
public class UsersController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String getdata(){
        return "Thanks";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ApplicationUser getUserByMobile(@PathVariable String id){
        return userRepository.findById(id);
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public Greeting registerUser(@RequestBody UserDTO userDTO){
        System.out.println("registed");
        System.out.println(userDTO.getFullName());
        System.out.println(userDTO.getMobile());
        System.out.println(userDTO.getPassword());
        return new Greeting(1, userDTO.getFullName());
    }







}
