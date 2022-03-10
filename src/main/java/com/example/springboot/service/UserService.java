package com.example.springboot.service;

import com.example.springboot.accessor.UserAccessor;
import com.example.springboot.dto.UserDTO;
import com.example.springboot.exceptions.InvalidUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserService {

    @Autowired
    private UserAccessor userAccessor;

    public UserDTO authenticate(String email, String password) throws InvalidUserException {
        UserDTO user = userAccessor.findUserByEmail(email);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return user;
            }
            else {
                throw new InvalidUserException("User with email " + email + " has wrong password!");
            }
        }
        else {
            throw new InvalidUserException("User with email " + email + " does not exist!");
        }
    }
}
