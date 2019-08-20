package com.kerno.utils.encrypt;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Base64;

@ExtendWith(MockitoExtension.class)
public class EncryptServiceTest {

    private static final String ENCRYPTED_TESTING_PWD = "dx+00x5OFJIkaq4wAtTTzKORw8h+mg8/3i8TXMuNkNIiGdr+mbxE8kYn33TekJPGaJn9lxII6n7puualLfiSdA==:3Ze0Ae0OGb/g/so8YY1de1L8g4nod6UHmXL++ljzZdgI4L/svoGYSaUzSVbRnGfj+Z1LJNSRvW9YmJJNUWW/ZA==";
    private static final String SALT_ENCRYPTED_TESTING_PWD = ENCRYPTED_TESTING_PWD.split(":")[0];
    private static final String HASH_ENCRYPTED_TESTING_PWD = ENCRYPTED_TESTING_PWD.split(":")[1];
    private static final String PASSWORD_TEXTPLAIN = "jmallas123";

    @InjectMocks
    private EncryptService encryptService;

    @Test
    public void encryptPasswordTest() {
        String password = encryptService.encryptPassword(PASSWORD_TEXTPLAIN);
        Assertions.assertNotNull(password);
    }

    @Test
    public void verifyPasswordTest() {
        byte[] salt = Base64.getDecoder().decode(SALT_ENCRYPTED_TESTING_PWD);
        byte[] hash = Base64.getDecoder().decode(HASH_ENCRYPTED_TESTING_PWD);

        Boolean isCorrect = encryptService.verifyPassword(PASSWORD_TEXTPLAIN, hash, salt);

        Assertions.assertTrue(isCorrect);

    }

    @Test
    public void isPasswordCorrectTest() {
        Boolean isCorrect = encryptService.isPasswordCorrect(ENCRYPTED_TESTING_PWD, "jmallas123");
        Assertions.assertTrue(isCorrect);
    }
}