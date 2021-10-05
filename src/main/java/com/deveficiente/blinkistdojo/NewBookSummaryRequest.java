package com.deveficiente.blinkistdojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class NewBookSummaryRequest {
    @NotBlank
    private String bookTitle;

    @Size(min = 1)
    @NotNull
    private List<BookChapterSummary> bookChapterSummary = new ArrayList<>();

    public NewBookSummaryRequest(String bookTitle, List<BookChapterSummary> bookChapterSummary) {
        this.bookTitle = bookTitle;
        this.bookChapterSummary = bookChapterSummary;
    }
}

class BookChapterSummary {
    @NotBlank
    private String title;
    @NotBlank
    private String summary;

    public BookChapterSummary(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }
}