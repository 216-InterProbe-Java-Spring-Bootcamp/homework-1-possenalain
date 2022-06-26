package com.ndigande.nalain_homework_one.product_comment.dao;

import com.ndigande.nalain_homework_one.product_comment.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCommentDao
        extends JpaRepository<ProductComment,Long> {

}
