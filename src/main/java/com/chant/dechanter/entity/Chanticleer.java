package com.chant.dechanter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Getter
@Setter
@Table(name="mktg_email")
public class Chanticleer {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
    @Id
    @Column(name="email_address")
    private static String emailName;

    public Chanticleer(String email) {
        this.emailName = email;
    }

}
