package com.ndigande.nalain_homework_one.product_comment.controller;

import com.ndigande.nalain_homework_one.product.dao.ProductDao;
import com.ndigande.nalain_homework_one.product_comment.dao.ProductCommentDao;
import com.ndigande.nalain_homework_one.product_comment.entity.ProductComment;
import com.ndigande.nalain_homework_one.usr.dao.UsrDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/comments")
@RequiredArgsConstructor
public class ProductCommentController {

    private final ProductCommentDao productCommentDao;
    private final ProductDao productDao;
    private  final UsrDao usrDao;

    @GetMapping(path="")
    public List<ProductComment> findAll(){
       return productCommentDao.findAll();
    }

    @PostMapping(path="")
    public ProductComment save(@RequestBody ProductComment productComment){

        Long usr_id=productComment.getUsrId().getId();
        Long product_id=productComment.getProductId().getId();

        Optional<ProductComment> productCmt=productDao.findById(product_id).map(product -> {
            productComment.setProductId(product);

            return productComment;
        });

        Optional<ProductComment> productCmt2=usrDao.findById(usr_id).map(usr -> {
            productComment.setUsrId(usr);

            return productComment;
        });

        return productCommentDao.save(productComment);
    }


}
