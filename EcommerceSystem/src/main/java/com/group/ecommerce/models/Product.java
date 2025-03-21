package com.group.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private double price;
    private int stockQuantity;

    public void updateStock(int quantity) {
        this.stockQuantity -= quantity;
    }
}
