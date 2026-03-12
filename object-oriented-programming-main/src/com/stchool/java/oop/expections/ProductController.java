package com.stchool.java.oop.expections;

import java.util.ArrayList;

public class ProductController {

 ProductService productService = new ProductService();
    public Product save(Product product) throws ProductExistException {
        return productService.save(product);
    }
    public ArrayList<Product> getAll(){
        return productService.getAll();
    }
    public Product getById(String id) throws ProductNotFoundException {
        return productService.getById(id);
    }
    public boolean deleteById(String id) throws ProductNotDeletedException {
        return productService.deleteById(id);
    }

    public Product update(String id, Product product) throws ProductNotFoundException {
        return productService.update( id, product);
    }
}
