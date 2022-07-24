package com.company.model;

import com.company.annotation.MyBean;

@MyBean
public class Account {
    public Account() {
        System.out.println("This is default constructor of account class.");
    }
}
