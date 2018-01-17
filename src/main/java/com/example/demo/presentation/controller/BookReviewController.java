package com.example.demo.presentation.controller;

import com.example.demo.application.service.report.BookReviewReportService;
import com.example.demo.application.service.review.BookReviewService;
import com.example.demo.domain.model.book.Book;
import com.example.demo.domain.model.report.BookReviewReport;
import com.example.demo.domain.model.review.BookReview;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/review")
public class BookReviewController {

    @Autowired
    BookReviewService bookReviewService;

    @Autowired
    BookReviewReportService bookReviewReportService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, produces = "application/pdf")
    public byte[] show() throws JRException {
        Book book = new Book("4798121967", "エリック・エヴァンスのドメイン駆動設計", "翔泳社", "2011/4/9");
        BookReview bookReview = bookReviewService.get(book);
        BookReviewReport bookReviewReport = bookReviewReportService.create(bookReview);
        return bookReviewReport.getValue();
    }
}