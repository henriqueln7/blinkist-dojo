package com.deveficiente.blinkistdojo;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.stream.Collectors;

public class NewBookSummaryRequest {
    @NotBlank
    private String bookTitle;

    @Size(min = 1)
    @NotNull
    @Valid
    private List<BookChapterSummaryRequest> chapterSummaries;

    public NewBookSummaryRequest(String bookTitle, List<BookChapterSummaryRequest> chapterSummaries) {
        this.bookTitle = bookTitle;
        this.chapterSummaries = chapterSummaries;
    }

    public BookSummary toBookSummary() {
        List<BookChapterSummary> chapterSummaries = this.chapterSummaries
                .stream()
                .map(BookChapterSummaryRequest::toChapterSummary)
                .collect(Collectors.toList());
        return new BookSummary(this.bookTitle, chapterSummaries);
    }
}

class BookChapterSummaryRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String summary;

    public BookChapterSummaryRequest(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }

    public BookChapterSummary toChapterSummary() {
        return new BookChapterSummary(this.title, this.summary);
    }
}