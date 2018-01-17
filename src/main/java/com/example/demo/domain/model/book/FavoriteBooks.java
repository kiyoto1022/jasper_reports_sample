package com.example.demo.domain.model.book;

import java.util.List;

public class FavoriteBooks {

    List<Book> value;

    public FavoriteBooks(List<Book> value) {
        this.value = value;
    }

    public List<Book> getValue() {
        return value;
    }
}