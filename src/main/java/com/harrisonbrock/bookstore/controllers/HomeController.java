package com.harrisonbrock.bookstore.controllers;

import com.harrisonbrock.bookstore.repositories.AuthorRepository;
import com.harrisonbrock.bookstore.repositories.BookRepository;
import com.harrisonbrock.bookstore.repositories.SectionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final SectionRepository sectionRepository;

    public HomeController(BookRepository bookRepository, AuthorRepository authorRepository, SectionRepository sectionRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.sectionRepository = sectionRepository;
    }

    @GetMapping("/books")
    public ResponseEntity<?> getAllBooks() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/authors")
    public ResponseEntity<?> getAllAuthors() {
        return new ResponseEntity<>(authorRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/sections")
    public ResponseEntity<?> getAllSection() {
        return new ResponseEntity<>(sectionRepository.findAll(), HttpStatus.OK);
    }
}
