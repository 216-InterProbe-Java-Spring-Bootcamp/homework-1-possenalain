package com.ndigande.nalain_homework_one.product_comment.controller;

import com.ndigande.nalain_homework_one.product_comment.dao.ProductCommentDao;
import com.ndigande.nalain_homework_one.product_comment.entity.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/comments")
@RequiredArgsConstructor
public class ProductCommentController {

    private final ProductCommentDao productCommentDao;

    @GetMapping(path="")
    public List<ProductComment> findAll(){
       return productCommentDao.findAll();
    }

    @PostMapping(path="")
    public ProductComment save(ProductComment productComment){
        return productCommentDao.save(productComment);
    }


}
