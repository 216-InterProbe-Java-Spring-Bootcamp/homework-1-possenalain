package com.ndigande.nalain_homework_one.product.dao;

import com.ndigande.nalain_homework_one.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long> {


    List<Product> findByNameContaning(String name);
}
