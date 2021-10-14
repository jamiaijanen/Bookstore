package com.example.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository Crepository,
//			UserRepository urepository) {
//		return (args) -> {
//
//			Crepository.save(new Category("Fantasy"));
//			Crepository.save(new Category("Comic"));
//			Crepository.save(new Category("Horror"));
//
//			repository.save(new Book("Ernest Hemingway", "A Farewell to Arms", "1232323-21", "1929",
//					Crepository.findByName("Fantasy").get(0)));
//			repository.save(new Book("George Orwell", "Animal Farm", "2212343-5", "1945",
//					Crepository.findByName("Horror").get(0)));
//
//			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
//			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
//			urepository.save(user1);
//			urepository.save(user2);
//
//		};
//	}
}
