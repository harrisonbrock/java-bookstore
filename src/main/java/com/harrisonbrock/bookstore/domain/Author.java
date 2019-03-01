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
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authorid")
    private long authorId;

    @NotBlank
    @Column(name = "lastname")
    private String lastName;

    @NotBlank
    @Column(name = "firstname")
    private String firstName;

    @ManyToMany
    @JoinTable(
            name = "wrote",
            joinColumns = {@JoinColumn(name = "authorid")},
            inverseJoinColumns = {@JoinColumn(name = "bookid")})
    @JsonIgnoreProperties("books")
    private Set<Book> books = new HashSet<>();

}
