package com.ndigande.nalain_homework_one.product.controller;

import com.ndigande.nalain_homework_one.product.dao.ProductDao;
import com.ndigande.nalain_homework_one.product.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor

public class ProductController {

    private final ProductDao productDao;

    @GetMapping(path = "")
    public List<Product> findAll(){
        return productDao.findAll();
    }
    @PostMapping(path = "")
    public Product save(@RequestBody Product product){
        return productDao.save(product);
    }
}
