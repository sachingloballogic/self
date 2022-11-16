package com.books.Repository;

import com.books.Entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepo extends JpaRepository<Books,Integer> {
}
