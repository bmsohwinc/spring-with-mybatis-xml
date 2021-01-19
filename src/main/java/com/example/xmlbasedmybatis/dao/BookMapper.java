package com.example.xmlbasedmybatis.dao;

import com.example.xmlbasedmybatis.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> findAll();
}
