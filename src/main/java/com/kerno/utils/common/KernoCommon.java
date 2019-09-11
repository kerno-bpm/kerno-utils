package com.kerno.utils.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kerno.utils.dto.CredentialsDto;
import com.kerno.utils.exception.KernoConflictException;
import com.kerno.utils.exception.KernoForbiddenException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

import java.io.IOException;

@Slf4j
public class KernoCommon {


    private KernoCommon() {
    }

    public static final ObjectMapper mapper = new ObjectMapper();


    public static KernoApiError getKernoApiError(String source) {
        try {
            return mapper.readValue(source, KernoApiError.class);
        } catch (IOException e) {
            log.error("Error to getting KernoApiError-->{}", e.getMessage());
            throw new KernoConflictException("Error to getting KernoApiError-->" + e.getMessage());
        }
    }

    public static String getMessageWhenEurekaInstanceIsNull(String serviceId) {
        return String.format("The query %s is null", serviceId);
    }

    private static String getMessageWhenAResponseIsNull(String serviceId) {
        return String.format("The response from the query %s is null", serviceId);
    }

    private static String getMessageWhenAResponseIsNotOK(String serviceId) {
        return String.format("Conflicts when consuming the query %s", serviceId);
    }

    public static Object getBody(ResponseEntity<?> response, String serviceId) {
        if (response == null) {
            log.error(getMessageWhenAResponseIsNull(serviceId));
            return null;
        }

        if (response.getStatusCode().equals(HttpStatus.CONFLICT)) {
            log.error(getMessageWhenAResponseIsNotOK(serviceId));
            return null;
        }
        return response.getBody();
    }

    public static CredentialsDto getCredentials(Authentication authentication) {
        if (authentication.isAuthenticated()) {
            return (CredentialsDto) authentication.getCredentials();
        }
        return null;
    }

    public static boolean canFetch(String accountId, CredentialsDto credentialsDto, String object) {
        if (credentialsDto == null) {
            String messageException = String.format("The %s cannot be obtained because the user is not logged", object);
            log.error(messageException);
            throw new KernoForbiddenException(messageException);
        }

        if (credentialsDto.isSuperUser()) {
            return true;
        }

        return credentialsDto.getAccountId().equals(accountId);
    }
    public HttpHeaders getHeaders(CredentialsDto credentialsDto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(credentialsDto.getBearerToken());

        if (credentialsDto != null) {
            headers.set("accountId", credentialsDto.getAccountId());
            headers.set("superUser", String.valueOf(true));
            headers.set("subject", credentialsDto.getSubject());
        }
        return headers;
    }
}
