package com.akashdey1006.spring6webapp.repositories;

import com.akashdey1006.spring6webapp.domain.Author;
import com.akashdey1006.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
