package com.example.inventory.inventory.manage.service;

import com.example.inventory.inventory.manage.entity.Product;

import java.util.List;

public interface ProductService {

     //getting all product details
    public List<Product> getAllProduct();

    //getting specific records by using id
    public Product GetProductById(int id);

    //save employee
    public Product SaveProduct(Product product);

    //iF WE WANT TYOdelete perticular product
    public void DeleteProductbYiD(int id);

    //if we want to update an product
    public void UpdateProduct(Product product);
}
