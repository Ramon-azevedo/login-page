package com.example.login_auth_api.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping()
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("Sucesso!");
    }
    
}
