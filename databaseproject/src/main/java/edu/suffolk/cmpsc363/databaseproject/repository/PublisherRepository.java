package edu.suffolk.cmpsc363.databaseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.suffolk.cmpsc363.databaseproject.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
