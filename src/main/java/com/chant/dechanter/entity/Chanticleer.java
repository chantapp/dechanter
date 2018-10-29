package com.chant.dechanter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
    private String email;

    public Chanticleer(String email) {
        this.email = email;
    }

}
