package org.perscholas.CrudDemo.repositories;

import org.perscholas.CrudDemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
