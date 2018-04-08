package com.chant.dechanter.entity;

import javax.persistence.*;

@Entity
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
