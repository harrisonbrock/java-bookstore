package com.harrisonbrock.bookstore.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookid")
    private long bookId;

    @NotBlank
    private String title;

    @NotBlank
    private String isbn;

    private int copy;

    private long sectionid;
    @ManyToMany
    @JsonIgnoreProperties("books")
    private Set<Author> authors = new HashSet<>();

}
