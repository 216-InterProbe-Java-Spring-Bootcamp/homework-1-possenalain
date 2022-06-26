package com.ndigande.nalain_homework_one.usr.controller;

import com.ndigande.nalain_homework_one.product_comment.dao.ProductCommentDao;
import com.ndigande.nalain_homework_one.product_comment.entity.ProductComment;
import com.ndigande.nalain_homework_one.usr.dao.UsrDao;
import com.ndigande.nalain_homework_one.usr.entity.Usr;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usrs")
@RequiredArgsConstructor

public class UsrController {
    private final UsrDao usrDao;
    private final ProductCommentDao productCommentDao;
    @GetMapping(path="")
    public List<Usr> findAll(){
        return usrDao.findAll();
    }

    @PostMapping(path = "")
    public Usr save(@RequestBody Usr usr){
        return usrDao.save(usr);
    }

    @GetMapping(path="/{usrId}")
    public Optional<Usr> findById(@PathVariable("usrId") Long usrId){
        System.out.println(usrId);
        return usrDao.findById(usrId);
    }



    @GetMapping(path="/{usrId}/comments/all")
    public Optional<ProductComment> findAllUserComments(@PathVariable("usrId") Long usrId){

        //check product exist
        boolean usrExists = usrDao.existsById(usrId);
        if(!usrExists){
            return null;
        }

        //get all comments for it
        return productCommentDao.findAllByUsrId(usrId);
    }
}

