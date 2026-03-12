package com.stchool.java.oop.expections;

import java.util.ArrayList;

public class ProductRepository {
//    save, getAll , getById, deleteById, update, exists;

//CRUD Operations


    public ArrayList<Product> products = new ArrayList<>();


    public Product save(Product product) {
        products.add(product);
        return product;
    }

    public ArrayList<Product> getAll() {
        return products;
    }

    public Product getById(String id) {
        System.out.println("Product id i want to get is " + id);
        for (Product product : products) {
            if (product.getId().equals(id)) ;
            return product;
        }
        return null;
    }

    public boolean deleteById(String id) {
        Product byId = getById(id);
        if (byId != null) {
            products.remove(byId);
            return true;
        }
        return false;
    }

    public boolean isExists(String id) {
        Product byId = getById(id);
        if (byId != null) {
            return true;
        }
        return false;
    }

    public Product update(String id, Product product) {
        Product byId = getById(id);
        products.remove(byId);
        products.add(product);
        return product;
    }


}
