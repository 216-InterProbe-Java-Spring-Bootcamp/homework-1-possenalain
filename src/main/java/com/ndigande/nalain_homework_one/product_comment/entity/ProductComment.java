package com.ndigande.nalain_homework_one.product_comment.entity;

import com.ndigande.nalain_homework_one.product.entity.Product;
import com.ndigande.nalain_homework_one.usr.entity.Usr;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "PRODUCT_COMMENT")
@Getter
@Setter

public class ProductComment {
    @Id
    @GeneratedValue(generator = "ProductComment")
    @SequenceGenerator(
            name = "ProductComment",
            sequenceName = "PRODUCT_COMMENT_ID_SEQ"
    )
    private Long id;

    @Column(name = "COMMENT",
            length = 500,
            nullable = false)
    private String comment;

    @Column(name = "COMMENT_DATE")
    private LocalDate commentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "PRODUCT_ID",
            foreignKey = @ForeignKey(name = "FK_PRODUCT_COMMENT"),
            nullable = false)
    private Product productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "USR_ID",
            foreignKey = @ForeignKey(name = "FK_USR_COMMENT"),
            nullable = false)
    private Usr usrId;

}
