package com.java.Customer.service;

import com.java.Customer.entity.Customer;

public interface CustomerService {
    Customer save(Customer customer);
    Customer update(Customer customer);
    Customer findOne(Long id);
    void delete(Long id);
    java.util.List<Customer> read();
}
