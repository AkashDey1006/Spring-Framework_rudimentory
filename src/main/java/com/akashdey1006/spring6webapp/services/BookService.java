package com.akashdey1006.spring6webapp.services;

import com.akashdey1006.spring6webapp.domain.Book;

public interface BookService {

    public Iterable<Book> findAll();
    
}
