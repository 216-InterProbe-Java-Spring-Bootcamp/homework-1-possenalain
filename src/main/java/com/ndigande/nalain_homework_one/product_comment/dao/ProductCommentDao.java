package com.ndigande.nalain_homework_one.product_comment.dao;

import com.ndigande.nalain_homework_one.product.entity.Product;
import com.ndigande.nalain_homework_one.product_comment.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface ProductCommentDao
        extends JpaRepository<ProductComment,Long> {
    Optional<ProductComment> findAllByProductId(Long productId);
    Optional<ProductComment> findByIdAndCommentDateBetween(Product productId, LocalDate from, LocalDate to);
    Optional<ProductComment> findByUsrIdAndCommentDateBetween(Long usrId, LocalDate from, LocalDate to);
    Optional<ProductComment> findAllByUsrId(Long usrId);
}
