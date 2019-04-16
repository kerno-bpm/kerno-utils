package com.kerno.utils.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ValidatorServiceTest {
    @InjectMocks
    protected ValidatorService validatorService;

    @Test
    public void isPasswordValidTest() {
        String password = "Kerno12345678";
        Boolean isvalid = validatorService.isValidPassword(password);
        Assertions.assertTrue(isvalid);
    }

    @Test
    public void isEmailValidTest() {
        String email = "kernobpm@gmail.com";
        Boolean isvalid = validatorService.isEmailValid(email);
        Assertions.assertTrue(isvalid);
    }
}