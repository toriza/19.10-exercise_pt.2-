package com.example.munchmonkeys.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Shop {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;

    @OneToMany (mappedBy = "shop")
    private List<Item> items;

    public Shop(String name, String location, List<Item> items) {
        this.name = name;
        this.location = location;
        this.items = items;
    }
}
