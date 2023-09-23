package com.example.uzummarket.user.entity;

import com.example.uzummarket.product.entity.Product;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "`users`")
public class User {
    @Id
    private UUID id;
    private List<Product> boughtProductsHistory;
    private List<Product> basket;
    private String name;
    private String lastname;
    private String password;
    private String email;
    private String phoneNumber;
    private int age;
    private double balance;
    private UserType userType;
}
