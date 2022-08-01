package com.springframework.bookstore.repositories;

import com.springframework.bookstore.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
