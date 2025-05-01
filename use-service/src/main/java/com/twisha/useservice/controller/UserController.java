package com.twisha.useservice.controller;


import com.twisha.useservice.model.User;
import com.twisha.useservice.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookings")
public class UserController {

    private UserRepository userRepo;

    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users")
    public List<User> fetchAllUsers() {
        return List.of(
                new User(1L, "A", "a@xyz"),
                new User(1L, "B", "b@xyz"),
                new User(1L, "C", "c@xyz")
        );
    }
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        com.twisha.useservice.entity.User dbUsr = new com.twisha.useservice.entity.User(
                user.getName(),
                user.getEmail()
        );
        dbUsr = userRepo.save(dbUsr);
        return new User(
                dbUsr.getId(),
                dbUsr.getName(),
                dbUsr.getAddr()
        );
    }
}
