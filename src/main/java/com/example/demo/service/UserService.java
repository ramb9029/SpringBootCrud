package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
        List<User> getAllUsers();
        User findById(Long id);
        User saveUser(User user);
        void deleteById(Long id);
}
