package com.example.inventory.inventory.manage.service;

import com.example.inventory.inventory.manage.entity.Product;
import com.example.inventory.inventory.manage.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired
ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        List<Product> list=new ArrayList<>();
        productRepository.findAll().forEach(product -> list.add(product));
        return list;
    }

    @Override
    public Product GetProductById(int id) {
      Product product=  productRepository.findById(id).get();  //here if we use optional class from java 8 we
                                                               //can handle null pointer exception
        return product;
    }

    @Override
    public Product SaveProduct(Product product) {
       Product Savedproduct= productRepository.save(product);
        return Savedproduct;
    }

    @Override
    public void DeleteProductbYiD(int id) {
        productRepository.deleteById(id);

    }

    @Override
    public void UpdateProduct(Product product) {

        productRepository.save(product);
    }
}
