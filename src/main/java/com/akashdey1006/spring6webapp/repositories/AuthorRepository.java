package com.akashdey1006.spring6webapp.repositories;

import com.akashdey1006.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
