package com.example.librarymanagment.Repository;

import com.example.librarymanagment.Entity.Books;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
    Books findBooksById(Long id);
    @NotNull
    List<Books> findAll();
    List<Books> findAllBooksByName(String name);
    List<Books> findAllBooksByAuthor(String name);
    List<Books> findAllBooksByCategory(String name);
    List<Books> findAllBooksByDescriptionContains(String name);
}