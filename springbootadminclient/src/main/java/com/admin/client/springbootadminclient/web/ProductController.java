package com.admin.client.springbootadminclient.web;

import com.admin.client.springbootadminclient.dao.ProductRepository;
import com.admin.client.springbootadminclient.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    private Product save(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/products")
    private List<Product> save(){
        return productRepository.findAll();
    }
}
