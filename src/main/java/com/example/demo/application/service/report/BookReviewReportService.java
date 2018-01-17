package com.example.demo.application.service.report;

import com.example.demo.domain.model.report.BookReviewReport;
import com.example.demo.domain.model.report.ReportFactory;
import com.example.demo.domain.model.report.ReportType;
import com.example.demo.domain.model.review.BookReview;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookReviewReportService {

    @Autowired
    ReportFactory reportFactory;

    public BookReviewReport create(BookReview bookReview) throws JRException {
        return reportFactory.create(ReportType.BookReviewReport, bookReview);
    }
}