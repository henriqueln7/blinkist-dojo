package com.deveficiente.blinkistdojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class NewBookSummaryRequest {
    @NotBlank
    private String bookTitle;

    @Size(min = 1)
    @NotNull
    private List<BookChapterSummaryRequest> chapterSummaries;

    public NewBookSummaryRequest(String bookTitle, List<BookChapterSummaryRequest> chapterSummaries) {
        this.bookTitle = bookTitle;
        this.chapterSummaries = chapterSummaries;
    }

    public BookSummary toBookSummary() {
        return new BookSummary(this.bookTitle,
                               this.chapterSummaries.stream().map(s -> s.toChapterSummary()).toList());
    }

    @Override
    public String toString() {
        return "NewBookSummaryRequest{" + "bookTitle='" + bookTitle + '\'' + ", chapterSummaries=" + chapterSummaries + '}';
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

    @Override
    public String toString() {
        return "BookChapterSummary{" + "title='" + title + '\'' + ", summary='" + summary + '\'' + '}';
    }

    public BookChapterSummary toChapterSummary() {
        return new BookChapterSummary(this.title, this.summary);
    }
}