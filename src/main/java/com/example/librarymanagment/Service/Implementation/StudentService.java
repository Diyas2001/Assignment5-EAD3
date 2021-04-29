package com.example.librarymanagment.Service.Implementation;

import com.example.librarymanagment.Entity.Students;
import com.example.librarymanagment.Repository.*;
import com.example.librarymanagment.Service.StudentsServiceInterface;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentsServiceInterface {

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
    public void addStudents(Students students) {
        this.studentsRepository.save(students);
    }

    @Override
    public void updateStudents(Students students) {
        this.studentsRepository.save(students);
    }

    @Override
    @NotNull
    public Optional<Students> getStudentsById(Long id) {
        return this.studentsRepository.findById(id);
    }

    @Override
    public List<Students> findAllStudents() {
        return this.studentsRepository.findAll();
    }
}
