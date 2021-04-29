package com.example.librarymanagment.Service;

import com.example.librarymanagment.Entity.Issues;

import java.util.List;
import java.util.Optional;

public interface IssuesServiceInterface {
    void addBookIssue(Issues bookIssues);
    void updateBookIssue(Issues bookIssues);
    Optional<Issues> getBookIssueById(Long id);
    List<Issues> findAllBookIssues();
}
