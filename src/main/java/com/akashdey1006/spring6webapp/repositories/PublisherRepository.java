package com.akashdey1006.spring6webapp.repositories;


import com.akashdey1006.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
