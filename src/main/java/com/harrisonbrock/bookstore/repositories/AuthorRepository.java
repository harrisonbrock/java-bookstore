package com.harrisonbrock.bookstore.repositories;

import com.harrisonbrock.bookstore.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
