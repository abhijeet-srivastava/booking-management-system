package com.twisha.bookingmanagementsystem.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "bms", name = "web_site_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WebSiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private  long Id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email_addr", nullable = false)
    private String email;

}
