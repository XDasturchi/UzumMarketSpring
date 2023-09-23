package com.example.uzummarket.category.entity;

import com.example.uzummarket.product.entity.Product;
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
@Table(name = "`categories`")
public class Category {
    @Id
    private UUID id;
    private String name;
    @ManyToMany
    @JoinTable(name = "company",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Product> products;
}
