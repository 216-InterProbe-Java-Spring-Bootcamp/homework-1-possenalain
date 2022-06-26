package com.ndigande.nalain_homework_one.usr.controller;

import com.ndigande.nalain_homework_one.usr.dao.UsrDao;
import com.ndigande.nalain_homework_one.usr.entity.Usr;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usrs")
@RequiredArgsConstructor

public class UsrController {

    private final UsrDao usrDao;

    @GetMapping(path="")
    public List<Usr> findAll(){
        return usrDao.findAll();
    }
    @PostMapping(path = "")
    public Usr save(@RequestBody Usr usr){
        return usrDao.save(usr);
    }
}

