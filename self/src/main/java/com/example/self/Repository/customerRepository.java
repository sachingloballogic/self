package com.example.self.Repository;

import com.example.self.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<Customer,Long> {
}
