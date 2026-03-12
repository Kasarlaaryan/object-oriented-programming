package com.stchool.java.oop.expections;

import java.util.ArrayList;

public class ProductService {

    ProductRepository productRepository = new ProductRepository();

    public Product save(Product product) throws ProductExistException {
        if (productRepository.isExists(product.getId())) {
            throw new ProductExistException("This Product is Already Exists with this Id : " + product.getId());
        }

        return productRepository.save(product);
    }

    public ArrayList<Product> getAll() {

        return productRepository.getAll();
    }

    public Product getById(String id) throws ProductNotFoundException {
        Product byId = productRepository.getById(id);
        if (byId == null)
            throw new ProductNotFoundException("This Product Not Found with the ID " + id);
        return byId;
    }

    public boolean deleteById(String id) throws ProductNotDeletedException {
        boolean deleteById = productRepository.deleteById(id);
        if (deleteById == false)
            throw new ProductNotDeletedException("This Product Not Deleted or not found with the ID : " + id);
        return deleteById;
    }

    public Product update(String id, Product product) throws ProductNotFoundException {
        if (!productRepository.isExists(id)) {
            throw new ProductNotFoundException("Product Not Found with Id : " + id);

        }
        return productRepository.update(id, product);
    }

}
