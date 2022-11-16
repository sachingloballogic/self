package com.example.self.Implementation;

import com.example.self.Entity.Service.userService;
import com.example.self.Entity.User;
import com.example.self.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class userImplementation implements userService {

    @Autowired
    private userRepository userRepository;

    @Override
    public User createUser(User user) {
        user.setDateCreated(LocalDate.now());
        user.setName(user.getFirstName() + " " + user.getLastName());
        User savedData = this.userRepository.save(user);
        return savedData;
    }

    @Override
    public User getById(Long id) {
        User user = this.userRepository.findById(id).get();
        return null;
    }

    @Override
    public List<User> getAll() {
        List<User> allUsers = this.userRepository.findAll();
        return allUsers;
    }

    @Override
    public void deleteUser(Long id) {
        User user = this.userRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("User Not found with User Id %s", id)));
        this.userRepository.delete(user);
    }
}
