package com.example.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;
import com.example.bookstore.domain.Category;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BookstoreRepositoryTests {

	@Autowired
	private BookRepository repository;

	@Test
	public void findByNameReturnBook() {
		List<Book> books = repository.findByAuthor("Ernest Hemingway");
		assertThat(books).hasSize(1);
	}

	@Test
	public void createNewBook() {
		Book book = new Book("J.K.Rowling", "Deathly Hallows part 1", "9877865-1", "2010", new Category("Scifi"));
		repository.save(book);
		assertThat(book.getId()).isNotNull();
	}

	@Test
	public void deleteBook() {
		Book book = new Book("J.K.Rowling", "Deathly Hallows part 1", "9877865-1", "2010", new Category("Scifi"));
		repository.save(book);
		repository.delete(book);
		assertThat(repository.count()).isEqualTo(2);
	}

	@Test
	public void deleteAllBooks() {
		repository.deleteAll();
		assertThat(repository.count()).isEqualTo(0);
	}
}
