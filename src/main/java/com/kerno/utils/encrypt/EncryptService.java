package com.kerno.utils.encrypt;

import lombok.extern.slf4j.Slf4j;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.logging.Logger;

@Slf4j
public abstract class EncryptService {
    private static final String ALGORITHM = "SHA-512";
    private static final int ITERATIONS = 64000;
    private static final int SALT_SIZE = 64;

    public static String encryptPassword(String password) {
        byte[] salt = generateSalt();
        byte[] hash = calculateHash(password, salt);
        return Base64.getEncoder().encodeToString(salt).concat(":").concat(Base64.getEncoder().encodeToString(hash));
    }

    public static byte[] calculateHash(String password, byte[] salt) {
        byte[] hash = new byte[64];
        try {
            MessageDigest md = MessageDigest.getInstance(ALGORITHM);
            md.reset();
            md.update(salt);
            hash = md.digest(password.getBytes(StandardCharsets.UTF_8));

            for (int i = 0; i < ITERATIONS; i++) {
                md.reset();
                hash = md.digest(hash);
            }

        } catch (NoSuchAlgorithmException ex) {
            log.error(ex.getMessage());
        }
        return hash;
    }

    public static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[SALT_SIZE];
        random.nextBytes(salt);
        return salt;
    }

    public static boolean verifyPassword(String password, byte[] originalHash, byte[] salt) {
        byte[] comparisonHash = calculateHash(password, salt);
        return comparePasswords(originalHash, comparisonHash);
    }

    public static boolean comparePasswords(byte[] originalHash, byte[] comparisonHash) {
        int diff = originalHash.length ^ comparisonHash.length;
        for (int i = 0; i < originalHash.length && i < comparisonHash.length; i++) {
            diff |= originalHash[i] ^ comparisonHash[i];
        }
        return diff == 0;
    }
}
