package com.example.librarymanagment.Service.Implementation;


import com.example.librarymanagment.Entity.Issues;
import com.example.librarymanagment.Repository.*;
import com.example.librarymanagment.Service.IssuesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IssuesService implements IssuesServiceInterface {


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
    public void addBookIssue(Issues bookIssues) {
        this.bookIssuesRepository.save(bookIssues);
    }

    @Override
    public void updateBookIssue(Issues bookIssues) {
        this.bookIssuesRepository.save(bookIssues);
    }

    @Override
    public Optional<Issues> getBookIssueById(Long id) {
        return this.bookIssuesRepository.findById(id);
    }

    @Override
    public List<Issues> findAllBookIssues() {
        return this.bookIssuesRepository.findAll();
    }
}
