package com.tommy.fsd.service;

import com.tommy.fsd.entities.Product;
import com.tommy.fsd.entities.ProductInOrder;
import com.tommy.fsd.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public List<ProductInOrder> list(){
        return orderRepo.findAll();
    }

    public ProductInOrder findById(Long orderId){
        return orderRepo.findByOrderId(orderId);
    }

}
