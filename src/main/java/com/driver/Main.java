package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly R = new RWOnly();
        R.setName("Sagar");
        System.out.println(R.getName());
//        java: name has private access in com.driver.RWOnly

    }
  
}