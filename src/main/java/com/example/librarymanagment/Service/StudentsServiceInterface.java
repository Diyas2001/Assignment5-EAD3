package com.example.librarymanagment.Service;

import com.example.librarymanagment.Entity.Students;
import com.sun.istack.NotNull;

import java.util.List;
import java.util.Optional;

public interface StudentsServiceInterface {
    void addStudents(Students students);
    void updateStudents(Students students);
    @NotNull
    Optional<Students> getStudentsById(Long id);
    List<Students> findAllStudents();

}
