package com.example.demo.domain.model.report;


public enum ReportType {

    FavoriteBookReport("/reports/favoriteBookReport.jrxml"),
    BookReviewReport("/reports/bookReviewReport.jrxml");

    String value;

    ReportType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}