package com.ndigande.nalain_homework_one.usr.dao;

import com.ndigande.nalain_homework_one.usr.entity.Usr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsrDao extends JpaRepository<Usr, Long> {
    /*
    List<Usr> findByNameContaing(String name);*/
}
