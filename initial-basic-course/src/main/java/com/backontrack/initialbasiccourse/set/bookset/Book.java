package com.backontrack.initialbasiccourse.set.bookset;

import java.util.Objects;

public class Book {
    private String title;
    private int yearOfPublishing;
    private String originalLanguage;
    private String author;
    private String genre;

    public Book(String title, int yearOfPublishing, String originalLanguage, String author, String genre) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.originalLanguage = originalLanguage;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "\nBook {" +
                "title='" + title + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(title, book.title) && Objects.equals(originalLanguage, book.originalLanguage) && Objects.equals(author, book.author) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearOfPublishing, originalLanguage, author, genre);
    }
}
