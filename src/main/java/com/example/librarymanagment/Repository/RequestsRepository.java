package com.example.librarymanagment.Repository;

import com.example.librarymanagment.Entity.Requests;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestsRepository extends JpaRepository<Requests, Long> {
    Requests findBookRequestsById(Long id);
    @NotNull
    List<Requests> findAll();
}