package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void processBooks() {
        System.out.println("Service: Processing books...");
        bookRepository.fetchBooks(); // using injected dependency
    }
}
