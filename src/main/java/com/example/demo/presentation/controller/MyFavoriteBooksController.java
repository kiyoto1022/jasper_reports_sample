package com.example.demo.presentation.controller;

import com.example.demo.application.service.book.MyFavoriteBookService;
import com.example.demo.application.service.report.FavoriteBookReportService;
import com.example.demo.domain.model.book.FavoriteBooks;
import com.example.demo.domain.model.report.FavoriteBookReport;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/favorite")
public class MyFavoriteBooksController {

    @Autowired
    MyFavoriteBookService myFavoriteBookService;

    @Autowired
    FavoriteBookReportService favoriteBookReportService;

    @ResponseBody
    @RequestMapping(produces = "application/pdf")
    public byte[] show() throws JRException {
        FavoriteBooks favoriteBooks = myFavoriteBookService.get();
        FavoriteBookReport favoriteBookReport = favoriteBookReportService.create(favoriteBooks);
        return favoriteBookReport.getValue();
    }
}