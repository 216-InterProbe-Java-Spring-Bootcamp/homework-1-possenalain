package com.ndigande.nalain_homework_one.product.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(generator = "Product")
    @SequenceGenerator(
            name = "Product",
            sequenceName ="PRODUCT_ID_SEQ"
    )
    private Long id;

    @Column(name = "NAME",
            nullable = false)

    private String name;

    @Column(name = "PRICE",
            nullable = false

    )
    private Double price;

    @Column(name = "EXPIRATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

}
