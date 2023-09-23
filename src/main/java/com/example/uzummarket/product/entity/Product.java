package com.example.uzummarket.product.entity;

import com.example.uzummarket.category.entity.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "`products`")
public class Product {
    @Id
    private UUID id;
    private String model;
    private String name;
    private double price;
    private String description;
    private Status status;
    @ManyToMany
    private List<Category> categories;
}
