package com.stchool.java.oop.collections;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();
        products.add(new Product("111","HP",70000.99));
        products.add(new Product("112","Lenovo",69999.99));
        products.add(new Product("113","Dell",69999.99));
        products.add(new Product("114","HP",70000.99));
        products.add(new Product("112","Lenovo",60000.99));
        System.out.println(products);
    }
}
