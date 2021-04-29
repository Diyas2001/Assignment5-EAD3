package com.example.librarymanagment.Repository;

import com.example.librarymanagment.Entity.Librarians;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibrariansRepository extends JpaRepository<Librarians, Long> {
    Librarians findLibrariansById(Long id);
    @NotNull
    List<Librarians> findAll();
}