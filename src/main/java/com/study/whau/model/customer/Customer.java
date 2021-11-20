package com.study.whau.model.customer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Customer {
    @Id
    private String email;

    private String name;

    private String password;

    private String phone;

    private String status;
}
