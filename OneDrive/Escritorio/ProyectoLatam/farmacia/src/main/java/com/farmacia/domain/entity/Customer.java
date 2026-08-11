package com.farmacia.domain.entity;

import com.farmacia.domain.valueobject.Email;


public class Customer {
    private final String id;
    private String name;
    private Email email;


    public Customer(String id, String name, Email email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public void updateContact(String newName, Email newEmail){
        this.name = newName;
        this.email = newEmail;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
    
}
    

