package com.deveficiente.blinkistdojo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewBookController {
    @PostMapping("/books")
    public void newBook() {

    }
}
