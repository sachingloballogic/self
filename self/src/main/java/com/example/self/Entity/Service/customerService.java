package com.example.self.Entity.Service;

import com.example.self.Entity.Customer;

import java.util.List;

public interface customerService {
    Customer createCustomer(Customer customer);

    Customer getCustomerById(Long id);

    List<Customer> getAll();

    void deleteById(Long id);

    Customer updateData(Long id, Customer customer);
}
