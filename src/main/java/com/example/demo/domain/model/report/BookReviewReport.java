package com.example.demo.domain.model.report;

public class BookReviewReport {

    byte[] value;

    public BookReviewReport(byte[] value) {
        this.value = value;
    }

    public byte[] getValue() {
        return value;
    }
}