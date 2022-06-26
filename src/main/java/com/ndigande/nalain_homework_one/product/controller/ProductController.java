package com.ndigande.nalain_homework_one.product.controller;

import com.ndigande.nalain_homework_one.product.dao.ProductDao;
import com.ndigande.nalain_homework_one.product.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor

public class ProductController {

    private final ProductDao productDao;

    @GetMapping(path = "/")
    public List<Product> findAll(){
        return productDao.findAll();
    }
}
