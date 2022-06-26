package com.ndigande.nalain_homework_one.usr.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;

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

}
