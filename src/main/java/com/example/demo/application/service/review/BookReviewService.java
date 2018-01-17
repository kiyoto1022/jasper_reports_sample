package com.example.demo.application.service.review;

import com.example.demo.domain.model.book.Book;
import com.example.demo.domain.model.review.BookReview;
import com.example.demo.domain.model.review.comment.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookReviewService {

    public BookReview get(Book book) {
        List<ReviewComment> reviewComments = new ArrayList<>();
        reviewComments.add(new ReviewComment("てぱん", "会社の同僚から勧められて購入。内容が抽象的で非常に理解し難い。かなり集中して読まないと全然頭に入ってこないです。", 3));
        reviewComments.add(new ReviewComment("le fond", "今後の実務のオブジェクト指向設計（アーキテクチャレベル）の指針になりそう。かなり良かった。", 5));
        reviewComments.add(new ReviewComment("Amazonのお客様", "もちろん何度も読み返して、理解を深めていくべき本ではあるけれど、一回読むだけでもすばらしさは充分わかりました。", 5));
        return new BookReview(book, new ReviewComments(reviewComments));
    }
}