package com.deveficiente.blinkistdojo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@RestController
public class NewUserController {

    private final UserRepository userRepository;

    public NewUserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/users")
    public Map<String, Long> newUser(@Valid @RequestBody NewUserRequest request) {
        User persistedUser = userRepository.save(request.toUser());
        return Map.of("id", persistedUser.getId());
    }
}
