package main.java.com.commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RegisterController {

    @GetMapping("/register")
    public String register() {
        return "Register"; // Le nom du fichier sans l'extension
    }
}