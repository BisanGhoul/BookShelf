package com.Bisan.BookShelf.layers.repository;

import com.Bisan.BookShelf.layers.domain.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

//ORM - object related mapping
//this class is for communication between data storages (SQL,Files, etc...)
//spring uses java reflect mpackage
@Repository //annotation
public class BookRespitory {

    private JdbcTemplate jdbcTemplate;

    public BookRespitory(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        System.out.println("jdbc value is "+jdbcTemplate);
    }

    public Book getBook(Long id){
        RowMapper<Book> rowMapper =  new BeanPropertyRowMapper<>(Book.class);
        //return book from DB
        Book book = jdbcTemplate.queryForObject("select * from books where id = ?",rowMapper,id);
        return book;
    }
}
