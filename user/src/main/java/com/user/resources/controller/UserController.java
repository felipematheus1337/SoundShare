package com.user.resources.controller;


import com.user.resources.dto.UserDTO;
import com.user.resources.dto.UserRequest;
import com.user.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
@RequiredArgsConstructor
public class UserController {


    private final UserService service;

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserRequest request) {
        return ResponseEntity.ok(service.createUser(request));
    }

    @GetMapping("/todos")
    public ResponseEntity<List<UserDTO>> listar() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findOne(@PathVariable String id) {
        return ResponseEntity.ok(service.getOneUser(id).get());
    }

}
