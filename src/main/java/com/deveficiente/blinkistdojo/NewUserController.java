package com.deveficiente.blinkistdojo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class NewUserController {

    private final UserRepository userRepository;

    public NewUserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/users")
    public void newUser(@Valid @RequestBody NewUserRequest request) {
        User newUser = request.toUser();
        userRepository.save(newUser);
    }
}
