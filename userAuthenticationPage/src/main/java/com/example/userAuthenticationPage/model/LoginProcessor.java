package com.example.userAuthenticationPage.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Getter
@Setter
public class LoginProcessor {

    private String username;
    private String password;

    public boolean login() {
        String username = this.getUsername();
        String password = this.getPassword();

        if ("maxim".equals(username) && "password".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}


