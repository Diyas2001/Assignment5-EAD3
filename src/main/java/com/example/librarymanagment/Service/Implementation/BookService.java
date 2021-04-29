package com.example.librarymanagment.Service.Implementation;

import com.example.librarymanagment.Entity.Books;
import com.example.librarymanagment.Repository.*;
import com.example.librarymanagment.Service.BookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookServiceInterface {

    @Autowired
    private IssuesRepository bookIssuesRepository;
    @Autowired
    private RequestsRepository bookRequestsRepository;
    @Autowired
    private BooksRepository bookRepository;
    @Autowired
    private LibrariansRepository librariansRepository;
    @Autowired
    private StudentsRepository readersRepository;


    @Override
    public void addBook(Books books) {
        this.bookRepository.save(books);
    }

    @Override
    public void updateBook(Books books) {
        this.bookRepository.save(books);
    }

    @Override
    public Books getBookById(Long id) {
        return this.bookRepository.findBooksById(id);
    }

    @Override
    public List<Books> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public List<Books> getBooksByName(String name) {
        return this.bookRepository.findAllBooksByName(name);
    }

    @Override
    public List<Books> getBooksByAuthor(String author) {
        return this.bookRepository.findAllBooksByAuthor(author);
    }

    @Override
    public List<Books> getBooksByCategory(String category) {
        return this.bookRepository.findAllBooksByCategory(category);
    }

    @Override
    public List<Books> getBooksByDescription(String description) {
        return this.bookRepository.findAllBooksByDescriptionContains(description);
    }
}
