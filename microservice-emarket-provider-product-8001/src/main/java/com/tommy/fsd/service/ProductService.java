package com.tommy.fsd.service;

import com.tommy.fsd.entities.Product;
import com.tommy.fsd.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> list(){
        return productRepo.findAll();
    };

   /* public boolean add(Product product){
        return  productRepo.addProduct(product);
    }*/

    public Product findById(Long productId){
        return productRepo.findByProductId(productId);
    };
}
