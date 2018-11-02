package com.chant.dechanter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mktg_email")
public class Chanticleer {

    @Id
    @Column(name="email_address")
    private String emailName;

    public Chanticleer() {

    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

}
