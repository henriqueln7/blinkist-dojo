package com.deveficiente.blinkistdojo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final String bookTitle;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "book_summary_id")
    private List<BookChapterSummary> chapterSummaries = new ArrayList<>();

    @Deprecated
    protected BookSummary(){
        this.bookTitle = null;
    }

    public BookSummary(@NotBlank String bookTitle, List<BookChapterSummary> chapterSummaries) {
        this.bookTitle = bookTitle;
        this.chapterSummaries.addAll(chapterSummaries);
    }

    public Long getId() {
        return this.id;
    }
}
