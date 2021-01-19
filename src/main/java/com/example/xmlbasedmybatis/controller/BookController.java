package com.example.xmlbasedmybatis.controller;

import com.example.xmlbasedmybatis.dao.BookMapper;
import com.example.xmlbasedmybatis.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/allbooks")
    public List<Book> getAllBooks() {
        return bookMapper.findAll();
    }
}
