package com.example.xmlbasedmybatis.controller;

import com.example.xmlbasedmybatis.dao.BookMapper;
import com.example.xmlbasedmybatis.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/onebook/{id}")
    public Book getBookById(@PathVariable(value = "id") int id) {
        return bookMapper.findById(id);
    }

    @GetMapping("/insertbook")
    public List<Book> insertBook(@RequestParam String name, @RequestParam String authorName) {
        int newId = bookMapper.getMaxId() + 1;
        System.out.println("=== the new id: " + newId);
        bookMapper.insertBook(newId, name, authorName);
        return bookMapper.findAll();
    }
}
