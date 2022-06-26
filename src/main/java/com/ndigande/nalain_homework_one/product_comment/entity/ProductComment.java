package com.ndigande.nalain_homework_one.product_comment.entity;

import com.ndigande.nalain_homework_one.product.entity.Product;
import com.ndigande.nalain_homework_one.usr.entity.Usr;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCT_COMMENT", indexes = {
        @Index(name = "idx_productcomment_usr_id", columnList = "USR_ID")
})
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
    @Temporal(TemporalType.DATE)
    private Date commentDate;

    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Product.class)
    @JoinColumn(
            name = "PRODUCT_ID",
            foreignKey = @ForeignKey(name = "FK_PRODUCT_COMMENT"),
            referencedColumnName = "ID",
            nullable = false)
    private Product productId;


    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Usr.class)
    @JoinColumn(
            name = "USR_ID",
            foreignKey = @ForeignKey(name = "FK_USR_COMMENT"),
            referencedColumnName = "ID",
            nullable = false)
    private Usr usrId;




}
