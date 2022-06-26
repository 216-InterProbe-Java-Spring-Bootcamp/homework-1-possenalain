package com.ndigande.nalain_homework_one.product.controller;

import com.ndigande.nalain_homework_one.product.dao.ProductDao;
import com.ndigande.nalain_homework_one.product.entity.Product;
import com.ndigande.nalain_homework_one.product_comment.dao.ProductCommentDao;
import com.ndigande.nalain_homework_one.product_comment.entity.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor

public class ProductController {

    private final ProductDao productDao;
    private final  ProductCommentDao productCommentDao;


    @GetMapping(path = "")
    public List<Product> findAll(){
        return productDao.findAll();
    }
    @PostMapping(path = "")
    public Product save(@RequestBody Product product){
        return productDao.save(product);
    }
    @GetMapping(path="/{productId}")
    public Optional<Product> findById(@PathVariable("productId") Long productId){
        return productDao.findById(productId);
    }

    @GetMapping(path="/{productId}/comments/all")
    public Optional<ProductComment> getProductAllComments(@PathVariable("productId") Long productId){

        //check product exist
        boolean productExists = productDao.existsById(productId);
        if(!productExists){
            return null;
        }

        //get all comments for it
        return productCommentDao.findAllByProductId(productId);
    }

    @GetMapping(path="/{productId}/comments")
    public Optional<ProductComment> findByIdAndCommentDateBetween(
            @PathVariable("productId") Long productId,
            @RequestParam(value = "from",required = true) String fromStr,
            @RequestParam(value = "to",required = true) String toStr){

        LocalDate from = LocalDate.parse(fromStr);
        LocalDate to = LocalDate.parse(toStr);

        //get all comments btn this period
        return productCommentDao.findByIdAndCommentDateBetween(productId,from,to);
    }
    @GetMapping(path = "/?expired=true")
    public Optional<Product> getExpiredProducts(){
        return productDao.findByExpirationDateBefore(LocalDate.now());
    }

    @GetMapping(path = "/?expired=false")
    public Optional<Product> getNullOrNonExpiredProducts(){
        return productDao.findByExpirationDateOrExpirationDateAfter(null,LocalDate.now());
    }

}
