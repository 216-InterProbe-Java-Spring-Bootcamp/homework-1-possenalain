package com.ndigande.nalain_homework_one.usr.dao;
import com.ndigande.nalain_homework_one.usr.entity.Usr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsrDao extends JpaRepository<Usr, Long> {
}
