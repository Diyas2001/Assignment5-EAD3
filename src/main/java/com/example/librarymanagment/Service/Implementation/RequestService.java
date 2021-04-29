package com.example.librarymanagment.Service.Implementation;

import com.example.librarymanagment.Entity.Requests;
import com.example.librarymanagment.Repository.*;
import com.example.librarymanagment.Service.RequestServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService implements RequestServiceInterface {

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
    public void addBookRequest(Requests bookRequests) {
        this.bookRequestsRepository.save(bookRequests);
    }

    @Override
    public void updateBookRequest(Requests bookRequests) {
        this.bookRequestsRepository.save(bookRequests);
    }

    @Override
    public Requests getBookRequestById(Long id) {
        return this.bookRequestsRepository.findBookRequestsById(id);
    }

    @Override
    public List<Requests> findAllBookRequests() {
        return this.bookRequestsRepository.findAll();
    }
}
