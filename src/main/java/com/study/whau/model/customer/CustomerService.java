package com.study.whau.model.customer;

import com.study.util.BaseService;
import com.study.whau.controller.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

}
