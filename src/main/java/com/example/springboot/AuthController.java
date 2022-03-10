package com.example.springboot;

import com.example.springboot.dto.UserDTO;
import com.example.springboot.exceptions.InvalidUserException;
import com.example.springboot.service.UserService;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;

import java.util.Date;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/loginWithEmail")
    public ResponseEntity<String> loginWithEmail(@RequestParam("email") String email, @RequestParam("password")
                                 String password) {
        try {
            UserDTO user = userService.authenticate(email, password);
            Date expirationDate = new Date(System.currentTimeMillis() + 1*60*60*1000);
            String secret = "HELLO";
            String token = Jwts.builder()
                    .setSubject(email)
                    .setAudience(user.getRole())
                    .setExpiration(expirationDate)
                    .signWith(SignatureAlgorithm.HS512, secret.getBytes())
                    .compact();
            return ResponseEntity.status(200).body(token);
        }
        catch(InvalidUserException ex) {
            return ResponseEntity.status(401).body(ex.getMessage());
        }
    }
}
