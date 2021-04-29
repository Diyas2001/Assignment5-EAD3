package com.example.librarymanagment.Service;

import com.example.librarymanagment.Entity.Books;

import java.util.List;

public interface BookServiceInterface {

    void addBook(Books books);
    void updateBook(Books books);
    Books getBookById(Long id);
    List<Books> getAllBooks();
    List<Books> getBooksByName(String name);
    List<Books> getBooksByAuthor(String author);
    List<Books> getBooksByCategory(String category);
    List<Books> getBooksByDescription(String description);

}
