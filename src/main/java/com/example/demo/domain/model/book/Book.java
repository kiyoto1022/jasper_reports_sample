package com.example.demo.domain.model.book;

public class Book {

    String isbn;
    String title;
    String publisher;
    String publicationDay;

    public Book(String isbn, String title, String publisher, String publicationDay) {
        this.isbn = isbn;
        this.title = title;
        this.publisher = publisher;
        this.publicationDay = publicationDay;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublicationDay() {
        return publicationDay;
    }
}