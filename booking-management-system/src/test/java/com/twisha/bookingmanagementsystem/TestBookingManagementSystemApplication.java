package com.twisha.bookingmanagementsystem;

import org.springframework.boot.SpringApplication;

public class TestBookingManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.from(BookingManagementSystemApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
