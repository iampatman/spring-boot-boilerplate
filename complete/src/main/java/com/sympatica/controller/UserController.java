package com.sympatica.controller;

/**
 * Created by NguyenTrung on 11/9/17.
 */

import com.sympatica.entity.ApplicationUser;
import com.sympatica.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller    // This means that this class is a Controller
@RequestMapping(path = "/users") // This means URL's start with /demo (after Application path)
public class UserController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @GetMapping(path = "/add", produces = MediaType.APPLICATION_JSON_UTF8_VALUE) // Map ONLY GET Requests
    public
    @ResponseBody
    String addNewUser(@RequestParam String name
            , @RequestParam String email, @RequestParam String id) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        ApplicationUser n = new ApplicationUser();
        n.setFullName(name);
        n.setEmail(email);
        n.setId(id);
        userRepository.save(n);
        return "Saved";
    }
//
//    @GetMapping(path = "/register", )
//    String registerUser(@RequestBody UserDTO userDTO){
//
//
//    }

    @GetMapping(path = "/all")
    public
    @ResponseBody
    Iterable<ApplicationUser> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
}