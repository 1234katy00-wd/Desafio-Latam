package com.farmacia.domain.valueobject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.farmacia.domain.exception.InvalidEmailException;

public class EmailTest {

    @Test
    @DisplayName("Should create an email valid")
    public void shouldCreateEmaiWithFormatIsValid(){
        String email =" username@mail.com";
        
        Email emailInstance = new Email(email);

        assertNotNull(emailInstance);
        assertEquals("username@mail.com", emailInstance.value());
    }

    @Test
    @DisplayName("should be lowercase and without spaces when creating the email")
    public void shouldTrimAndConvertToLowerCase(){
        String email = "Username@Mail.com";

        Email emailInstance = new Email (email);

        assertNotNull(emailInstance);
        assertEquals("username@mail.com", emailInstance.value());
    }
    @Test
    @DisplayName("Should fail when email format is invalid")
    public void shouldFailWhenEmailFormatIsInvalid() {
    String invalidEmail = "inavalid email";

    assertThrows(InvalidEmailException.class, () -> {
        new Email(invalidEmail);
    });
    } 
}

