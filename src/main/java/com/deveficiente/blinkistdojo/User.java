package com.deveficiente.blinkistdojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank @Email
    private final String email;

    @Deprecated
    protected User(){
        this.email = null;
    }

    public User(@NotBlank @Email String email) {
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }
}
