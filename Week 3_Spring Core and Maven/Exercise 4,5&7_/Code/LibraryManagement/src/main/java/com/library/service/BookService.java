package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String category;
    private BookRepository bookRepository;

    public BookService(String category) {
        this.category = category;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("Adding book in category '" + category + "': " + bookName);
        bookRepository.saveBook(bookName);
    }
}
