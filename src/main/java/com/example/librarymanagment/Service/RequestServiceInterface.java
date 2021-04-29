package com.example.librarymanagment.Service;

import com.example.librarymanagment.Entity.Requests;

import java.util.List;

public interface RequestServiceInterface {
    void addBookRequest(Requests bookRequests);
    void updateBookRequest(Requests bookRequests);
    Requests getBookRequestById(Long id);
    List<Requests> findAllBookRequests();
}
