package com.Quiz.manager.Quiz.manager.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @GetMapping
    List<User> getUsers() {
        return Arrays.asList(
                new User(1L, "Ali", "Ali@java.com", "password123", Permission.EDIT),
                new User(2L, "Simon", "Simon@java.com", "p@ssword!", Permission.RESTRICTED)
        );
    }
}
