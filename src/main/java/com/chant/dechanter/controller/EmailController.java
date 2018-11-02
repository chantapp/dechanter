package com.chant.dechanter.controller;

import com.chant.dechanter.entity.Chanticleer;
import com.chant.dechanter.repo.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
//
//import java.util.concurrent.atomic.AtomicLong;

@RestController
public class EmailController {
//    private final AtomicLong count = new AtomicLong();

    @Autowired
    EmailRepository repo;

    @PostMapping(value = "/emails/{email}")
    public Chanticleer addEmails(@PathVariable("email") String email) {
        Chanticleer c = new Chanticleer();
        c.setEmailName(email);
        repo.save(c);
        return c;
    }

    @GetMapping(value = "/emails")
    public ResponseEntity<?> getEmails() {
        List<Chanticleer> a = repo.findAll();
        return new ResponseEntity<>(a,HttpStatus.OK);
    }

}