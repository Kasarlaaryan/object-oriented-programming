package com.stchool.java.oop.expections;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ProductExistException {
        try {
            ProductController productController = new ProductController();

            //Create
            Product product1 = new Product("P1001", "Laptop", 3000.00, 8.0F);
            Product product2 = new Product("P1003", "Laptop", 3000.00, 8.0F);
            Product product3 = new Product("P1002", "Laptop", 3000.00, 8.0F);


            //save products
            productController.save(product1);
            productController.save(product2);
            productController.save(product3);

//            getAll
            ArrayList<Product> products = productController.getAll();
            System.out.println("All Products : " + products);

//            getById
            Product byId = productController.getById("P1001");
            System.out.println("The Product detials of the id is :  " + byId);

            //update
            Product updateProduct = new Product("P1001", "Laptop1", 30989.00, 8.5F);
            productController.update("P1001", updateProduct);

            boolean deleteById = productController.deleteById("P1001");
            System.out.println(productController.getAll());

        } catch (ProductExistException e) {
            System.out.println(e.getMessage());
        } catch (ProductNotFoundException e){
            System.out.println(e.getMessage());
        } catch (ProductNotDeletedException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println();
        }
    }
}
