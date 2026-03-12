package com.stchool.java.oop.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<Product> products = new LinkedHashSet<>();
        products.add(new Product("111", "HP", 70000.99));
        products.add(new Product("112", "Lenovo", 69999.99));
        products.add(new Product("113", "Dell", 69999.99));
        products.add(new Product("114", "HP", 70000.99));
        products.add(new Product("115", "Lenovo", 60000.99));
        System.out.println(products);
        System.out.println("size of the products " + products.size());
//        for (Product product : products){
//            System.out.println(product);
//        }

        Scanner scanner = new Scanner(System.in);
        String productId;
        System.out.println("Please enter id ");
        productId = scanner.next();
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
//            System.out.println(product);
            if (p.getId().equals(productId)) {
                iterator.remove();
            }
        }
        System.out.println(products);
        scanner.close();
        System.out.println(products.size());
    }

}

