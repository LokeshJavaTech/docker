package com.lokesh.compose.controller;

import com.lokesh.compose.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = List.of(
                User.builder().id(1L).name("A").build(),
                User.builder().id(2L).name("B").build(),
                User.builder().id(3L).name("C").build(),
                User.builder().id(4L).name("D").build(),
                User.builder().id(4L).name("E").build()
        );
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }



}
