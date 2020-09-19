package com.unicid.dbcloud.controller;

import com.unicid.dbcloud.model.Contact;
import com.unicid.dbcloud.repository.ContactRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/contacts"})
public class ContactController {

    private ContactRepository repository;

    ContactController(ContactRepository contactRepository){
        this.repository = contactRepository;
    }

    // CRUD
    // JSON format select * from contact
    @GetMapping
    public List<Contact> findAll() {
        return repository.findAll();
    }

}
