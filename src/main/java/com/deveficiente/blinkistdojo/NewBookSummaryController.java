package com.deveficiente.blinkistdojo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class NewBookSummaryController {
    @PostMapping("/summaries")
    public void newBookSummary(@Valid @RequestBody NewBookSummaryRequest request) {
        System.out.println("chegooou");
    }
}
