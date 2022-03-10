package com.example.springboot.accessor;

import com.example.springboot.dto.UserDTO;
import com.example.springboot.models.Roles;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserAccessor {
    public UserDTO findUserByEmail(String email) {
        if (email.equals("ps06756@gmail.com")) {
            return new UserDTO(email, "hello123", "97181453545", Roles.ROLE_ADMIN);
        }
        else if (email.equals("ps0@gmail.com")) {
            return new UserDTO(email, "hello321", "91734244342", Roles.ROLE_VIEWER);
        }
        else {
            return null;
        }
    }
}
