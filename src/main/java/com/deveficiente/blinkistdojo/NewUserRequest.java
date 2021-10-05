package com.deveficiente.blinkistdojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class NewUserRequest {
    @NotBlank
    @Email
    private final String email;

    @JsonCreator
    public NewUserRequest(@JsonProperty("email") String email) {
        this.email = email;
    }

    public User toUser() {
        return new User(email);
    }
}
