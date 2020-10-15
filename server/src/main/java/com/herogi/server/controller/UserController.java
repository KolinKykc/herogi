package com.herogi.server.controller;

import com.herogi.server.reader.UserReader;
import com.herogi.server.model.User;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    List<User> users;

    public UserController() throws Exception {
        File file = new ClassPathResource("users.csv").getFile();
        this.users = UserReader.readFile(file);
    }

    @GetMapping(value = "/users", produces = "application/json")
    public List<User> getUsers() {
        return users;
    }
}
