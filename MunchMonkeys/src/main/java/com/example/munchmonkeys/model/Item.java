package com.example.munchmonkeys.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "item_list")
public class Item {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String description;
    private double price;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @ManyToMany(mappedBy = "items")
    private Set<Order> orders = new HashSet<>();

    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

}
