package com.example.demo.application.service.book;

import com.example.demo.domain.model.book.Book;
import com.example.demo.domain.model.book.FavoriteBooks;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyFavoriteBookService {

    public FavoriteBooks get() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("4822284646", "UMLモデリングの本質", "日経BP社", "2011/5/26"));
        books.add(new Book("4798107956", "UML モデリングのエッセンス 第3版 (Object Oriented SELECTION)", "翔泳社", "2005/6/16"));
        books.add(new Book("4798121967", "エリック・エヴァンスのドメイン駆動設計", "翔泳社", "2011/4/9"));
        return new FavoriteBooks(books);
    }
}