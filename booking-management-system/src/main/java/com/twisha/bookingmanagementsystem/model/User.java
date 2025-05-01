package com.twisha.bookingmanagementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;



public class User {
    @JsonProperty(value = "user_id")
    private Long id;

    @JsonProperty(value = "user_name")
    private String name;

    @JsonProperty(value = "email_addr")
    private String email;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
