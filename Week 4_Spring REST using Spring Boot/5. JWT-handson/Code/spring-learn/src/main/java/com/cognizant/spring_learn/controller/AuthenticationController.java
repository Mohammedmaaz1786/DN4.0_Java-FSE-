package com.cognizant.spring_learn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.JwtBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import static com.cognizant.spring_learn.security.JwtUtil.SECRET_KEY;


import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import io.jsonwebtoken.security.Keys;
import java.security.Key;


@RestController
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START");
        LOGGER.debug("Authorization Header: {}", authHeader);

        String user = getUser(authHeader);
        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("END");
        return map;
    }

    private String getUser(String authHeader) {
        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decoded = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(decoded);
        String user = credentials.split(":")[0];

        LOGGER.debug("Extracted User: {}", user);
        return user;
    }

    private String generateJwt(String user) {
        return Jwts.builder()
                .setSubject(user)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000)) // 20 mins
                .signWith(SECRET_KEY)
                .compact();
    }

}
