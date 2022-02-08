package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User findById(Long id);
    User saveUser(User user);
    void deleteById(Long id);
}
