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

    @PutMapping(value = "/emails/{email}")
    public Chanticleer addEmails(@PathVariable("email") String email) {
        Chanticleer c = new Chanticleer();
        if(notRealEmail(email)) {
            return c;
        }
        c.setEmailName(email);
        repo.save(c);
        return c;
    }

    @GetMapping(value = "/emails")
    public ResponseEntity<?> getEmails() {
        List<Chanticleer> a = repo.findAll();
        return new ResponseEntity<>(a,HttpStatus.OK);
    }

    private boolean notRealEmail(String email) {
        //check for at sign
        boolean at = false;
        int stop = 0;
        for(int i = 0; i<email.length() || at==false; i++){
            char curr = email.charAt(i);
            if(curr == '@') {
                if(at==true) return false;
                at = true;
            } else if(curr == '.') {
                if(at==true && i<(email.length()-1)) return true;
            }
        }
        return false;
        //check for .
    }

}