package com.Mateus.assistencia_tecnica_api.service;
/*
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

@Service
public class JwtService {
    private final String SECRET = "assistencia-tecnica-secret-key-muito-segura-2024";
    private final long EXPIRACAO = 1000 * 60 * 60 * 8; // 8 horas

    private Key getChave() {
        byte[] bytes = Base64.getEncoder().encode(SECRET.getBytes());
        return Keys.hmacShaKeyFor(bytes);
    }

    public String gerarToken(String email) {
        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRACAO))
                .signWith(getChave())
                .compact();
    }

    public String extrairEmail(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getChave())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean tokenValido(String token) {
        try {
            extrairEmail(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}*/
