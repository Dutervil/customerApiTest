package com.java.Customer.response;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;

@Data @Builder
public class ApiResonse {
    private  String message;
    private java.util.Map<?,?> data=new HashMap<>();
}
