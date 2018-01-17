package com.example.demo.infrastructure.datasource;

import com.example.demo.domain.model.book.FavoriteBooks;
import com.example.demo.domain.model.report.BookReviewReport;
import com.example.demo.domain.model.report.ReportFactory;
import com.example.demo.domain.model.report.FavoriteBookReport;
import com.example.demo.domain.model.report.ReportType;
import com.example.demo.domain.model.review.BookReview;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReportFactoryDataSource implements ReportFactory {

    @Override
    public FavoriteBookReport create(ReportType reportType, FavoriteBooks favoriteBooks) throws JRException {
        JasperReport jasperReport = getJasperReportOf(reportType);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, new JRBeanCollectionDataSource(favoriteBooks.getValue()));
        return new FavoriteBookReport(JasperExportManager.exportReportToPdf(jasperPrint));
    }

    @Override
    public BookReviewReport create(ReportType reportType, BookReview bookReview) throws JRException {
        JasperReport jasperReport = getJasperReportOf(reportType);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("bookTitle", bookReview.getBook().getTitle());
        parameters.put("averageMark", bookReview.averageMark());

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JRBeanCollectionDataSource(bookReview.getReviewComments().getValue()));
        return new BookReviewReport(JasperExportManager.exportReportToPdf(jasperPrint));
    }

    private JasperReport getJasperReportOf(ReportType reportType) throws JRException {
        InputStream reportStream = getClass().getResourceAsStream(reportType.getValue());
        return JasperCompileManager.compileReport(reportStream);
    }
}