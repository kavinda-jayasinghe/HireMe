package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

@Table(name="worker")
public class Worker {
    @Id
    @Column(name="woker_id",length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int workerId;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="email")
    private String email;

    @Column(name="city")
    private String city;

    @Column(name="contact")
    private String contact;

    @Column(name="category")
    private String category;

    @Column(name="password")
    private String password;

    @Column(name="certifications")
    private String certifications;

    @Column(name="address")
    private String address;

    @Column(name="description")
    private String description;

    public Worker(String first_name, String last_name, String email, String city, String contact, String category, String password, String certifications, String address,  String description) {
    }
}
