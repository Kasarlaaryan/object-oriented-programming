package com.stchool.java.oop.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("111", "HP", 70000.99));
        products.add(new Product("112", "Lenovo", 69999.99));
        products.add(new Product("113", "Dell", 69999.99));
        products.add(new Product("114", "HP", 70000.99));
        products.add(new Product("115", "Lenovo", 60000.99));
        products.add(new Product("115", "Lenovo", 60000.99));


//        System.out.println(products);
        System.out.println("______size________");
        System.out.println(products.size());
        System.out.println("______Total Products________");

        System.out.println(products);
        System.out.println("______Print in a product by index________");

        System.out.println(products.get(2));
        System.out.println("______Updating the Product by index by add________");

        products.add(3, new Product("123", "Lava", 500.00));
        System.out.println(products.get(3));
        System.out.println("______set in the product by index based ________");

        products.set(3, new Product("133", "Mac Book", 67000.00));
        System.out.println(products.size());
        System.out.println(products.get(3));
        System.out.println("______removing the product by index________");

        System.out.println(products.remove(4));
        System.out.println(products);
        System.out.println(products.size());


        System.out.println("--------Iterator----------------------");
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            System.out.println(p);
        }
        System.out.println("------------for Each------------");

        for (Product pr : products) {
            System.out.println(pr);
        }
    }
}
