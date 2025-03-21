package com.group.ecommerce.controllers;

import com.group.ecommerce.models.User;
import com.group.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        User newUser = userService.register(user);
        return ResponseEntity.ok(newUser);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestParam String email) {
        Optional<User> user = userService.login(email);
        return user.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.status(401).build());
    }
}
