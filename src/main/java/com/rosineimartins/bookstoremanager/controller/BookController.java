package com.rosineimartins.bookstoremanager.controller;


import com.rosineimartins.bookstoremanager.dto.messageResponseDto;
import com.rosineimartins.bookstoremanager.entity.Book;
import com.rosineimartins.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    BookService bookService;


    @PostMapping
    public messageResponseDto create(@RequestBody Book book) {
        return bookService.create(book);

    }
}
