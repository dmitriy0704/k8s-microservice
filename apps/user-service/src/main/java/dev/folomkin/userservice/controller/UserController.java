package dev.folomkin.userservice.controller;

import dev.folomkin.userservice.entity.User;
import dev.folomkin.userservice.entity.UserDto;
import dev.folomkin.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }


    @GetMapping("/test-conn")
    public String checkConnection() {
        return "Test connection by User Service successful!";
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserDto dto) {
        return ResponseEntity.ok().body(service.create(dto));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(service.allUsers());
    }
}
