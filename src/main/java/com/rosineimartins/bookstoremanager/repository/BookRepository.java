package com.rosineimartins.bookstoremanager.repository;

import com.rosineimartins.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
