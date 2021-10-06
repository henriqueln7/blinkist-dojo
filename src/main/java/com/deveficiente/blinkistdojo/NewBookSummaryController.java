package com.deveficiente.blinkistdojo;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import java.util.Map;

@RestController
public class NewBookSummaryController {

    @PersistenceContext
    private EntityManager manager;

    @PostMapping("/bookSummaries")
    @Transactional
    public Map<String, Object> newBookSummary(@Valid @RequestBody NewBookSummaryRequest request) {
        BookSummary newBookSummary = request.toBookSummary();
        manager.persist(newBookSummary);
        return Map.of("id", newBookSummary.getId());
    }
}
