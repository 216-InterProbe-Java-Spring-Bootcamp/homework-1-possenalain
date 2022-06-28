package com.ndigande.nalain_homework_one.usr.entity;


import com.ndigande.nalain_homework_one.product_comment.entity.ProductComment;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Set;

@Entity
@Table(name ="USR")
@Getter
@Setter
public class Usr {
    @Id
    @GeneratedValue(generator = "Usr")
    @SequenceGenerator(
            name = "Usr",
    sequenceName = "USR_ID_SEQ"
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

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "usrId")
    private Set<ProductComment> productComments;

}
