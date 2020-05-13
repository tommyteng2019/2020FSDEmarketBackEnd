package com.tommy.fsd.repo;

import com.tommy.fsd.entities.ProductInOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<ProductInOrder, Long> {

    List<ProductInOrder> findAll();

    ProductInOrder findByOrderId(long orderId);
    
}
