package com.springframework.bookstore.repositories;

import com.springframework.bookstore.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
