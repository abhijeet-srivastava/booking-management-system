package com.twisha.useservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty(value = "user_id")
    private Long id;

    @JsonProperty(value = "user_name")
    private String name;

    @JsonProperty("user_email_addr")
    private String email;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
