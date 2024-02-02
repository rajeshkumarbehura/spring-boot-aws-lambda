package com.rkb.aws.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rkb.aws.data.User;

@RestController
@RequestMapping("/api/v1/")
public class CustomerController {

    @GetMapping(value = "customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUser() {
        return List.of(
                new User("John", "Doe", "john.doe@xyz.com"),
                new User("Stan", "Warner", "Stan.Warner@xyz.com")
        );
    }

}
