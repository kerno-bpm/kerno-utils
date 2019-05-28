package com.kerno.utils.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ValidatorServiceTest {

    @InjectMocks
    private ValidatorService validatorService;

    @Test
    public void isPasswordValidTest() {
        String password = "Kerno12345678";
        Boolean isValid = validatorService.isValidPassword(password);
        Assertions.assertTrue(isValid);
    }

    @Test
    public void isEmailValidTest() {
        String email = "kernobpm@gmail.com";
        Boolean isValid = validatorService.isEmailValid(email);
        Assertions.assertTrue(isValid);
    }
}