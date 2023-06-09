package com.rosineimartins.bookstoremanager.service;


import com.rosineimartins.bookstoremanager.dto.BookDTO;
import com.rosineimartins.bookstoremanager.dto.messageResponseDto;
import com.rosineimartins.bookstoremanager.entity.Book;
import com.rosineimartins.bookstoremanager.exception.BookNotFoundException;
import com.rosineimartins.bookstoremanager.mapper.BookMapper;
import com.rosineimartins.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;
    private BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public messageResponseDto create(BookDTO bookDto) {
        Book bookToSave = bookMapper.toModel(bookDto);
        Book savedBook = bookRepository.save(bookToSave);
        return messageResponseDto.builder()
                .messageDto("Book created whith id " + savedBook.getId())
                .build();
    }
    public BookDTO findById(Long id) throws BookNotFoundException {
       Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
      return bookMapper.toDTO(book);
    }

}
