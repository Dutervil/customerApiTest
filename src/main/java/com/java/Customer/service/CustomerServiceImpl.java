package com.java.Customer.service;

import com.java.Customer.CustomerRepo;
import com.java.Customer.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public Customer save(Customer customer) {
        return this.customerRepo.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return this.customerRepo.save(customer);
    }

    @Override
    public Customer findOne(Long id) {
        return this.customerRepo.findById(id).orElse(new Customer());
    }

    @Override
    public void delete(Long id) {
        this.customerRepo.deleteById(id);
    }

    @Override
    public List<Customer> read() {
        return this.customerRepo.findAll();
    }
}
