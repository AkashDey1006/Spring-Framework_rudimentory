package com.akashdey1006.spring6webapp.bootstrap;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.akashdey1006.spring6webapp.domain.Author;
import com.akashdey1006.spring6webapp.domain.Book;
import com.akashdey1006.spring6webapp.domain.Publisher;
import com.akashdey1006.spring6webapp.repositories.AuthorRepository;
import com.akashdey1006.spring6webapp.repositories.BookRepository;
import com.akashdey1006.spring6webapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author akash = new Author();
        akash.setFirstName("Akash");
        akash.setLastName("Dey");

        Book akashBook = new Book();
        akashBook.setTitle("Domain Driven Design");
        akashBook.setIsbn("123456789");

        Author akashSaved = authorRepository.save(akash);
        Book akashSavedBook = bookRepository.save(akashBook);

        Author ashish = new Author();
        ashish.setFirstName("Ashish");
        ashish.setLastName("Dey");

        Book ashishBook = new Book();
        ashishBook.setTitle("Domain Driven Design2");
        ashishBook.setIsbn("12345678");

        Author ashishSaved = authorRepository.save(ashish);
        Book ashishSavedBook = bookRepository.save(ashishBook);


        akashSaved.getBooks().add(akashSavedBook);
        ashishSaved.getBooks().add(ashishSavedBook);
        akashSavedBook.getAuthors().add(akashSaved);
        ashishSavedBook.getAuthors().add(ashishSaved);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("My Publisher");
        publisher.setAddress("123 Main");
        Publisher savedPublisher = publisherRepository.save(publisher);

        akashSavedBook.setPublisher(savedPublisher);
        ashishSavedBook.setPublisher(savedPublisher);

        authorRepository.save(akashSaved);
        authorRepository.save(ashishSaved);
        bookRepository.save(akashSavedBook);
        bookRepository.save(ashishSavedBook);


        System.out.println("In Bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());

    }
}
