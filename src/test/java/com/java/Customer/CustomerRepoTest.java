package com.java.Customer;

import com.java.Customer.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepoTest {

    @Autowired
     private CustomerRepo customerRepo;

    @Test
    public void createCustomerTest(){
       Customer customer=Customer.builder()
               .email("dwadson3@gmail.com")
               .firstname("wadson")
               .lastname("dutervil")
               .phone("31340028")
               .build();
       this.customerRepo.save(customer);
    }
    @Test
    public void updateCustomerTest(){
        Customer customer=Customer.builder()
                .id(1L)
                .email("dwadson3@gmail.com")
                .firstname("wadson[update]")
                .lastname("dutervil")
                .phone("31340028")
                .build();
        this.customerRepo.save(customer);
    }

    @Test
    public void listerCustomerTest(){
        java.util.List<Customer> customerList=this.customerRepo.findAll();

        customerList.forEach((e)->{
            System.out.println(e.getEmail());
        });

    }



}