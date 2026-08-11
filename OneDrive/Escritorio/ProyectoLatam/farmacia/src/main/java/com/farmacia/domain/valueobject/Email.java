package com.farmacia.domain.valueobject;

import com.farmacia.domain.exception.InvalidEmailException;

public record Email(String value){
    public Email{
        String emailRegex="^[a-zA-Z0-9]+([._%+-][a-zA-Z0-9]+)*@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    String emailClean = value.trim().toLowerCase();

    if(!emailClean.matches(emailRegex)){
        throw new  InvalidEmailException("Correo no es válido." + value);
    }

    value = value.trim().toLowerCase();
    }
}