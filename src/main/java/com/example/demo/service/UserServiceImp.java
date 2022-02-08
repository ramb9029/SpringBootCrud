package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService{


    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findById(Long id) {
        return userDao.findById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User saveUser(User user) {
        return userDao.saveUser(user);
    }

    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

}
