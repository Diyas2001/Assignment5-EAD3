package com.example.librarymanagment.Service.Implementation;

import com.example.librarymanagment.Entity.Librarians;
import com.example.librarymanagment.Repository.*;
import com.example.librarymanagment.Service.LibrarianServiceInterface;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibrarianService implements LibrarianServiceInterface {


    @Autowired
    private IssuesRepository bookIssuesRepository;
    @Autowired
    private RequestsRepository bookRequestsRepository;
    @Autowired
    private BooksRepository bookRepository;
    @Autowired
    private LibrariansRepository librariansRepository;
    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public void addLibrarian(Librarians librarians) {
        this.librariansRepository.save(librarians);
    }

    @Override
    public void updateLibrarian(Librarians librarians) {
        this.librariansRepository.save(librarians);
    }

    @Override
    @NotNull
    public Optional<Librarians> getLibrarianById(Long id) {
        return this.librariansRepository.findById(id);
    }

    @Override
    public List<Librarians> findAllLibrarians() {
        return this.librariansRepository.findAll();
    }
}
