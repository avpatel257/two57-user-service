package com.two57.service.user.controller;

import com.two57.service.user.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/users")
public class UserController extends BaseController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/user/{id}")
    public User getById(@PathVariable("id") final long id) {
        final User user = new User();
        user.setId(id);
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail(Optional.of("john.doe@google.com"));
        return user;
    }

    @RequestMapping("/")
    public List<User> getAllUsers() {
        final List<User> users = new ArrayList<>(5);
        for (int i = 1; i <= 5; i++) {
            final User user = new User();
            user.setId((long)i);
            user.setFirstName("John");
            user.setLastName("Doe");
            user.setEmail(Optional.of("john.doe@google.com"));
            users.add(user);
        }
        return users;
    }


}
