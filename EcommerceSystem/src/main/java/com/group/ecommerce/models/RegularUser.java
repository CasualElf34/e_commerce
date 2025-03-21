package com.group.ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("REGULAR")
public class RegularUser extends User {
}
