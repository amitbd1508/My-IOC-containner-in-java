package com.company;

import com.company.annotation.MyInjector;
import com.company.model.Course;

public class Main {

    public static void main(String[] args) throws Exception {
      MyInjector myInjector = new MyInjector();
      myInjector.scanForBean();
      System.out.println("----");
      System.out.println(myInjector.getBean(Course.class));
    }
}
