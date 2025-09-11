package com.project.ecom_proj.service;

import com.project.ecom_proj.model.Product;
import com.project.ecom_proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repo;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product getProducts(int id){
        return repo.findById(id).get();
    }
}
