package com.chant.dechanter.controller;

import com.chant.dechanter.entity.Chanticleer;
import com.chant.dechanter.repo.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//
//import java.util.concurrent.atomic.AtomicLong;

@RestController
public class EmailController {
//    private final AtomicLong count = new AtomicLong();

    @Autowired
    EmailRepository repo;

    @RequestMapping(value = "/emails/{email}", method = RequestMethod.POST)
    public Chanticleer addEmail(@PathVariable("email") String email) {
        Chanticleer c = new Chanticleer(email);
        repo.save(c);
        return c;
    }
//
//    @PostMapping(value="hi")
//    public Chanticleer hi(@RequestParam(name="email", required=false, defaultValue="none") String email) {
//        Chanticleer c = new Chanticleer(email);
//        repo.save(c);
//        return c;
//    }
//
    @RequestMapping(value="/test")
    public String test() {
        return "dd";
    }
}