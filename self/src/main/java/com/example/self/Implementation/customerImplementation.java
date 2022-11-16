package com.example.self.Implementation;


import com.example.self.Entity.Customer;
import com.example.self.Entity.Service.customerService;
import com.example.self.Repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class customerImplementation implements customerService {

    @Autowired
    private customerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        customer.setDateCreated(LocalDate.now());
        customer.setName(customer.getFirstName()+ " " + customer.getMiddleName() + " " + customer.getLastName());
        Customer saveData=this.customerRepository.save(customer);
        return saveData;
    }

    @Override
    public Customer getCustomerById(Long id) {
        this.customerRepository.findById(id).get();
        return null;
    }

    @Override
    public List<Customer> getAll() {
     List<Customer> allCustomer =   this.customerRepository.findAll();
      return allCustomer;
    }

    @Override
    public void deleteById(Long id) {
        this.customerRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("User not found with user Id %s",id)));

    }

    @Override
    public Customer updateData(Long id, Customer customer) {
        Customer data= this.customerRepository.findById(id).get();
        data.setFirstName(customer.getFirstName());
        data.setMiddleName(customer.getMiddleName());
        data.setLastName(customer.getLastName());
        data.setGender(customer.getGender());
        data.setDateCreated(customer.getDateCreated());
        data.setTimeCreated(customer.getTimeCreated());
        data.setName(customer.getFirstName() + " " + customer.getMiddleName() + " " + customer.getLastName());
        Customer updateData =this.customerRepository.save(customer);
        return updateData;
    }


}
