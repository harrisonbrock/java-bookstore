package com.harrisonbrock.bookstore.repositories;

import com.harrisonbrock.bookstore.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
