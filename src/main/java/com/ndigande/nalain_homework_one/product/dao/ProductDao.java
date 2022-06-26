package com.ndigande.nalain_homework_one.product.dao;

import com.ndigande.nalain_homework_one.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ProductDao extends JpaRepository<Product, Long> {
    Optional<Product> findByExpirationDateBefore(LocalDate now);

/*
    List<Product> findByNameContaning(String name);*/

}
