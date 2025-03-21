package com.group.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ElementCollection
    private List<Long> items;

    private String status = "Pending";

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}
