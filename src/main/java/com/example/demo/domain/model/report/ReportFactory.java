package com.example.demo.domain.model.report;

import com.example.demo.domain.model.book.FavoriteBooks;
import com.example.demo.domain.model.review.BookReview;
import net.sf.jasperreports.engine.JRException;

public interface ReportFactory {
    FavoriteBookReport create(ReportType reportType, FavoriteBooks favoriteBooks) throws JRException;
    BookReviewReport create(ReportType reportType, BookReview bookReview) throws JRException;
}