package com.example.librarymanagment.Service;

import com.example.librarymanagment.Entity.Librarians;
import com.sun.istack.NotNull;

import java.util.List;
import java.util.Optional;

public interface LibrarianServiceInterface {
    void addLibrarian(Librarians librarians);
    void updateLibrarian(Librarians students);
    @NotNull
    Optional<Librarians> getLibrarianById(Long id);
    List<Librarians> findAllLibrarians();
}
