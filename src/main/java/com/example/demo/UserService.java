package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private Map<String, User> users = new HashMap<>();

    public UserService() {
        users.put("1", new User("1", "Cristian Steven Niño Mateus"));
    }

    public User findById(String id) {
        return users.get(id);
    }
}
