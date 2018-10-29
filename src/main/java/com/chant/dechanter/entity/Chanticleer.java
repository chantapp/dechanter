package com.chant.dechanter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="chanticleer")
public class Chanticleer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="email")
    private String email;

    public Chanticleer(String email) {
        this.email = email;
    }

}
