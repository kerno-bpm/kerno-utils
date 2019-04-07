package com.kerno.utils.encrypt;

import lombok.Data;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.logging.Logger;

@Data
public class EncryptService {
    public String ALGORITHM = "SHA-512";
    public int ITERATIONS = 64000;
    public int SALT_SIZE = 64;
    private final static Logger LOGGER = Logger.getLogger("EncryptService");

    public String encryptPassword(String password) {
        byte[] salt = generateSalt();
        byte[] hash = calculateHash(password, salt);
        return Base64.getEncoder().encodeToString(salt).concat(":").concat(Base64.getEncoder().encodeToString(hash));
    }

    protected byte[] calculateHash(String password, byte[] salt) {
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
            LOGGER.info(ex.getMessage());
        }
        return hash;
    }

    protected byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[SALT_SIZE];
        random.nextBytes(salt);
        return salt;
    }

    public boolean verifyPassword(String password, byte[] originalHash, byte[] salt) {
        byte[] comparisonHash = calculateHash(password, salt);
        return comparePasswords(originalHash, comparisonHash);
    }

    public boolean comparePasswords(byte[] originalHash, byte[] comparisonHash) {
        int diff = originalHash.length ^ comparisonHash.length;
        for (int i = 0; i < originalHash.length && i < comparisonHash.length; i++) {
            diff |= originalHash[i] ^ comparisonHash[i];
        }
        return diff == 0;
    }
}
