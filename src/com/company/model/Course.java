package com.company.model;

import com.company.annotation.MyAutowired;

public class Course {
    @MyAutowired
    private int id;
    @MyAutowired
    private String name;
    @MyAutowired
    private String code;
}
