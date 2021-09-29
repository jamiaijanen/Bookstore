package com.example.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;
import com.example.bookstore.domain.Category;
import com.example.bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository Crepository) {
		return (args) -> {

			Crepository.save(new Category("Fantasy"));
			Crepository.save(new Category("Comic"));
			Crepository.save(new Category("Horror"));

			repository.save(new Book("Ernest Hemingway", "A Farewell to Arms", "1232323-21", "1929",
					Crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("George Orwell", "Animal Farm", "2212343-5", "1945",
					Crepository.findByName("Horror").get(0)));

		};
	}
}
