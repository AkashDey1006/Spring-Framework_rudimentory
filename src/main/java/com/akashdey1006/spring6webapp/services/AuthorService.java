package com.akashdey1006.spring6webapp.services;

import com.akashdey1006.spring6webapp.domain.Author;

public interface AuthorService {
    public Iterable<Author>  findAll();
}
