package com.deveficiente.blinkistdojo;

import javax.persistence.*;

@Entity
public class BookChapterSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String summary;

    @Deprecated
    protected BookChapterSummary(){}

    public BookChapterSummary(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }
}
