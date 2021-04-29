package com.example.librarymanagment.Repository;

import com.example.librarymanagment.Entity.Students;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {
    @NotNull
    Optional<Students> findById(Long id);
    @NotNull
    List<Students> findAll();
}
