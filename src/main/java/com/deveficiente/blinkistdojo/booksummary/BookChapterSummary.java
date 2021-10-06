package com.deveficiente.blinkistdojo.booksummary;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class BookChapterSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String summary;
    @NotNull @Positive
    private int chapterOrder;

    @Deprecated
    protected BookChapterSummary(){}

    public BookChapterSummary(String title, String summary, @NotNull @Positive int chapterOrder) {
        this.title = title;
        this.summary = summary;
        this.chapterOrder = chapterOrder;
    }
}
