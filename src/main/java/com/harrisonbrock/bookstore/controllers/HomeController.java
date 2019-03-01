package com.harrisonbrock.bookstore.controllers;

import com.harrisonbrock.bookstore.repositories.AuthorRepository;
import com.harrisonbrock.bookstore.repositories.BookRepository;
import com.harrisonbrock.bookstore.repositories.SelectionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final SelectionRepository selectionRepository;

    public HomeController(BookRepository bookRepository, AuthorRepository authorRepository, SelectionRepository selectionRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.selectionRepository = selectionRepository;
    }

    @GetMapping("/books")
    public ResponseEntity<?> getAllBooks() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }
}
