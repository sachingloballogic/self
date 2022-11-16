package com.example.self.Repository;

import com.example.self.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Long> {
}
