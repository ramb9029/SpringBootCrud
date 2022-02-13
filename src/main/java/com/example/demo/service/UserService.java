package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User findById(Long id);
    public List<User> getAllUsers();
    public User saveUser(User user);
    public void deleteById(Long id);

}
