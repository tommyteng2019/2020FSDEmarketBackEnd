package com.tommy.fsd.controller;

import com.tommy.fsd.entities.Product;
import com.tommy.fsd.entities.ProductInOrder;
import com.tommy.fsd.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
   private OrderService orderService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<ProductInOrder> list(){
        return orderService.list();
    }

    @RequestMapping(value = "/get/{orderId}", method = RequestMethod.GET)
    public ProductInOrder get(@PathVariable Long orderId){
        return orderService.findById(orderId);
    }
}
