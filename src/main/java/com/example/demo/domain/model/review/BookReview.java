package com.example.demo.domain.model.review;

import com.example.demo.domain.model.book.Book;
import com.example.demo.domain.model.review.comment.ReviewComments;

public class BookReview {

    Book book;
    ReviewComments reviewComments;

    public BookReview(Book book, ReviewComments reviewComments) {
        this.book = book;
        this.reviewComments = reviewComments;
    }

    public Book getBook() {
        return book;
    }

    public ReviewComments getReviewComments() {
        return reviewComments;
    }

    public int averageMark() {
        return reviewComments.totalScore() / reviewComments.count();
    }
}