package br.com.rlb.springwithpageable.services;

import br.com.rlb.springwithpageable.models.Book;
import br.com.rlb.springwithpageable.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Page<Book> getBooks(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        Page<Book> all = bookRepository.findAll(pageable);

        return all;
    }
}
