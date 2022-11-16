package com.example.self.Entity.Service;

import com.example.self.Entity.User;

import java.util.List;

public interface userService {
    User createUser(User user);
    User getById(Long id);
    List<User> getAll();
    void deleteUser(Long id);
}
