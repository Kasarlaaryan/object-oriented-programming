package com.stchool.java.oop.collections;

import java.util.Objects;

public class Product  implements Comparable<Product>{
    private String id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
//        return this.id.compareTo(product.getId()); acessinding order
//        decessinding order
        return product.getId().compareTo(this.id);
    }
//@Override
//public int compareTo(Product product) {
//    return this.name.compareTo(product.getName());
//}
//@Override
//public int compareTo(Product product) {
////    return Double.compare(this.price,product.getPrice()); accessinding order of the list
//    return Double.compare(product.getPrice(), this.price);   decessinding order of the list
//
//}
}
