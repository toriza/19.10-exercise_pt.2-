package com.example.munchmonkeys.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table (name = "customers")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String email;
    private String deliveryAddress;

    @OneToMany

    public Person(String name, String email, String deliveryAddress) {
        this.name = name;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
    }
}
