package com.example.self.Controller;

import com.example.self.Entity.Service.userService;
import com.example.self.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService userService;

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody User user){
        User savedData = this.userService.createUser(user);
        //return ResponseEntity.status(HttpStatus.CREATED).body(savedData);
        //return new ResponseEntity<>(savedData, HttpStatus.OK);
        return ResponseEntity.ok(savedData);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.FOUND)
    public List<User> getAll(){
        List<User> allUser = this.userService.getAll();
        return allUser;
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteUser(@PathVariable Long id){
        this.userService.deleteUser(id);
        return "Deleted Successfully";
    }
}
