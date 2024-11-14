package com.backontrack.initialbasiccourse.bookstringdivider;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String firstCategory;
    private String secondCategory;
    private String pages;
    private String complexity;
    private String year;
    private String description;

    public Book(String title, String author, String firstCategory, String secondCategory, String pages, String complexity, String year, String description) {
        this.title = title;
        this.author = author;
        this.firstCategory = firstCategory;
        this.secondCategory = secondCategory;
        this.pages = pages;
        this.complexity = complexity;
        this.year = year;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFirstCategory() {
        return firstCategory;
    }

    public void setFirstCategory(String firstCategory) {
        this.firstCategory = firstCategory;
    }

    public String getSecondCategory() {
        return secondCategory;
    }

    public void setSecondCategory(String secondCategory) {
        this.secondCategory = secondCategory;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(firstCategory, book.firstCategory) && Objects.equals(secondCategory, book.secondCategory) && Objects.equals(pages, book.pages) && Objects.equals(complexity, book.complexity) && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, firstCategory, secondCategory, pages, complexity, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", firstCategory='" + firstCategory + '\'' +
                ", secondCategory='" + secondCategory + '\'' +
                ", pages='" + pages + '\'' +
                ", complexity='" + complexity + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
