package com.example.inventory.inventory.manage.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.inventory.inventory.manage.entity.Product;
import com.example.inventory.inventory.manage.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/getemp")
public class ProductController {
     @Autowired
    ProductServiceImpl productServiceimpl;

     //here we have to make methods for all services
    @GetMapping("/allProduct")
    public List<Product> getAllProduct(){
      List<Product> list=  productServiceimpl.getAllProduct();
      return list;
    }
    @GetMapping("{id}")
    public Product GetProductById(@PathVariable("id") int id){
      Product product1=  productServiceimpl.GetProductById(id);
      return product1;
    }
    @PostMapping("/saveProduct")
    public Product SaveProduct(@RequestBody Product product){
      Product product2=  productServiceimpl.SaveProduct(product);
        return product2;
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void DeleteProductbYiD(@PathVariable int id){
        productServiceimpl.DeleteProductbYiD(id);
        System.out.println("employee is deleted");
    }
    @PutMapping("/updateProduct")
    public void UpdateProduct(@RequestBody Product product){
        productServiceimpl.UpdateProduct(product);
        System.out.println("employee is updated");
    }
}
