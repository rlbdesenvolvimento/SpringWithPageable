package br.com.rlb.springwithpageable.repositories;

import br.com.rlb.springwithpageable.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
