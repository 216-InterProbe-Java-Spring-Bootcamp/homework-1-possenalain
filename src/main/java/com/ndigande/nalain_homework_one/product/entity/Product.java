package com.ndigande.nalain_homework_one.product.entity;

import com.ndigande.nalain_homework_one.product_comment.entity.ProductComment;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

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
    private LocalDate expirationDate;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "productId")
    private Set<ProductComment> productComments;

}
