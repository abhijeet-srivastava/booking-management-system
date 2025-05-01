package com.twisha.bookingmanagementsystem.controller;


import com.twisha.bookingmanagementsystem.model.User;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bookings")
@Slf4j
public class BookingController {

    @GetMapping("/users")
    public List<User> fetchUsers() {
        return List.of(
                new User(1L, "A", "a@xyz.com"),
                new User(2L, "B", "b@xyz.com"),
                new User(3L, "C", "c@xyz.com")
        );
    }
    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }
}
