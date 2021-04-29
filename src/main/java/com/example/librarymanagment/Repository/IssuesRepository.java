package com.example.librarymanagment.Repository;

import com.example.librarymanagment.Entity.Issues;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IssuesRepository extends JpaRepository<Issues, Long> {
    @NotNull
    Optional<Issues> findById(Long id);
    @NotNull
    List<Issues> findAll();
}