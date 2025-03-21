package com.group.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    @ElementCollection
    private Map<Long, Integer> items = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        items.put(product.getId(), items.getOrDefault(product.getId(), 0) + quantity);
    }

    public void removeProduct(Long productId) {
        items.remove(productId);
    }
}
