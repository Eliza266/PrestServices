package com.serviceback.serviceback.domain.dtos.auth;
import java.io.Serializable;

public class AuthenticationRequest implements Serializable {
    private String username;
    private String password;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
