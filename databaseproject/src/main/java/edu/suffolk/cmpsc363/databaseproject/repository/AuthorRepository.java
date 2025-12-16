package edu.suffolk.cmpsc363.databaseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.suffolk.cmpsc363.databaseproject.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
