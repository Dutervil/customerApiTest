package com.java.Customer.controler;

import com.java.Customer.entity.Customer;
import com.java.Customer.response.ApiResonse;
import com.java.Customer.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/all")
   public ResponseEntity<ApiResonse>  lister(){
        java.util.List<Customer> datas=this.customerService.read();

        Map<String, java.util.List<Customer>> map = new HashMap<>();

        map.put("Evaluation", datas);
        ApiResonse res = ApiResonse.builder()
                .message("The list of customer")
                .data(map)
                .build();
        return ResponseEntity.ok().body(res);


    }

    @PostMapping("/save")
    public ResponseEntity<ApiResonse>  save(@RequestBody Customer  customer){
        Customer data=this.customerService.save(customer);

        Map<String, Customer> map = new HashMap<>();

        map.put("saved Customer", data);
        ApiResonse res = ApiResonse.builder()
                .message("Customer is saved successfully")
                .data(map)
                .build();
        return ResponseEntity.ok().body(res);


    }
}
