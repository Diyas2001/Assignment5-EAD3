package com.example.librarymanagment;

import com.example.librarymanagment.Configuration.Config;
import com.example.librarymanagment.Controller.LibraryCont;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryManagmentTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        LibraryCont controller = context.getBean("libraryCont", LibraryCont.class);
    }
}
