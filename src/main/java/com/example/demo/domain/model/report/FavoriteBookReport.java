package com.example.demo.domain.model.report;

public class FavoriteBookReport {

    byte[] value;

    public FavoriteBookReport(byte[] value) {
        this.value = value;
    }

    public byte[] getValue() {
        return value;
    }
}