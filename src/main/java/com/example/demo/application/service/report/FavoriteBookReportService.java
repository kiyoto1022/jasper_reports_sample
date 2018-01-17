package com.example.demo.application.service.report;

import com.example.demo.domain.model.book.FavoriteBooks;
import com.example.demo.domain.model.report.FavoriteBookReport;
import com.example.demo.domain.model.report.ReportFactory;
import com.example.demo.domain.model.report.ReportType;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteBookReportService {

    @Autowired
    ReportFactory reportFactory;

    public FavoriteBookReport create(FavoriteBooks favoriteBooks) throws JRException {
        return reportFactory.create(ReportType.FavoriteBookReport, favoriteBooks);
    }
}