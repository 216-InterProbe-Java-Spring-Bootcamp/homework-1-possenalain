package com.ndigande.nalain_homework_one.usr.controller;

import com.ndigande.nalain_homework_one.usr.dao.UsrDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usr")
@RequiredArgsConstructor

public class UsrController {

    private final UsrDao usrDao;

    @GetMapping(path="/")
    public List<com.ndigande.nalain_homework_one.usr.entity.Usr> findAll(){
        return usrDao.findAll();
    }

}
