package com.ndigande.nalain_homework_one.product.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
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

    @Entity
    @Table(name ="USER")
    @Getter
    @Setter
    public static class User {
        @Id
        @GeneratedValue(generator = "User")
        @SequenceGenerator(
                name = "User",
        sequenceName = "USER_ID_SEQ"
        )
        private Long id;

        @Column(name = "NAME",
                length = 50,
                nullable = false)
        private String name;

        @Column(name = "SURNAME",
                length = 50,
                nullable = false)
        private String surname;

        @Email
        @Column(name = "EMAIL",
                length = 50,
                nullable = false)
        private String email;


        @Column(name = "TELEPHONE",
                length = 15,
                nullable = false)
        private String phoneNumber;

    }
}
