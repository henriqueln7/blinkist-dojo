package com.deveficiente.blinkistdojo.booksummary;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListBookSummaryController {

    @GetMapping("/bookSummaries")
    public void listBookSummary() {
        System.out.println("oi");
    }
}
