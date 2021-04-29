package com.example.librarymanagment.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.example.librarymanagment")
@PropertySource("application.properties")
@EnableJpaRepositories(basePackages = "com.example.librarymanagment.Repository")

public class Config {
}
