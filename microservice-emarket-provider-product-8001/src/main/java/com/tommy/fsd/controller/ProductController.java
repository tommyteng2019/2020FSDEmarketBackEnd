package com.tommy.fsd.controller;

import com.tommy.fsd.entities.Product;
import com.tommy.fsd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /*@RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(Product product) {return productService.add(product);}*/

    @RequestMapping(value = "/get/{productId}", method = RequestMethod.GET)
    public Product get(@PathVariable Long productId){
        return productService.findById(productId);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Product> list(){
        return productService.list();
    }
}

