package com.tommy.fsd.repo;

import com.tommy.fsd.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    Product findByProductId(long productId);

    List<Product> findAll();

    //boolean addProduct(Product product);
}