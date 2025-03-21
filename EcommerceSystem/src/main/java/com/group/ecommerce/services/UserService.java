package com.group.ecommerce.services;

import com.group.ecommerce.models.User;
import java.util.Optional;

public interface UserService {
    User register(User user);
    Optional<User> login(String email);
}
