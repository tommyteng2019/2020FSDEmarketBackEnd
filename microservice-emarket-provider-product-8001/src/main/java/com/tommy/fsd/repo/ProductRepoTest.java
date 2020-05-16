/*
package com.tommy.fsd.repo;

import com.tommy.fsd.entities.Product;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import org.junit.runner.RunWith;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepoTest {
    @Autowired
    private ProductRepo productRepo;

    @Before
    public void before(){
        Product product = new Product();
        product.setCategoryType(1);
        product.setProductIcon("test");
        product.setProductId((long) 8);
        product.setProductStatus(1);
        product.setProductPrice(123);
    }

    @Test
    public void testAdd(){
        Product product = new Product();
        product.setCategoryType(2);
        product.setProductIcon("test2");
        product.setProductId((long) 82);
        product.setProductStatus(11);
        product.setProductPrice(123456);
    }

    @After
    public void after(){
        productRepo.deleteById((long) 2);
    }
}
*/
