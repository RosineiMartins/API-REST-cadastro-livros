package com.rosineimartins.bookstoremanager.controller;


import com.rosineimartins.bookstoremanager.dto.BookDTO;
import com.rosineimartins.bookstoremanager.dto.messageResponseDto;
import com.rosineimartins.bookstoremanager.exception.BookNotFoundException;
import com.rosineimartins.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping
    public messageResponseDto create(@RequestBody BookDTO bookDto) {
        return bookService.create(bookDto);
    }
    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id) throws BookNotFoundException {
        return bookService.findById(id);
    }
}