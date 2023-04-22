package com.rosineimartins.bookstoremanager.service;


import com.rosineimartins.bookstoremanager.dto.messageResponseDto;
import com.rosineimartins.bookstoremanager.entity.Book;
import com.rosineimartins.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public messageResponseDto create(Book book) {
        Book booksaved = bookRepository.save(book);
        return messageResponseDto.builder().messageDto("Book created with id " + booksaved.getId())
                .build();
    }
}
