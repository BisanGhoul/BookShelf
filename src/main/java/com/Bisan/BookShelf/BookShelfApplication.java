package com.Bisan.BookShelf;

import com.Bisan.BookShelf.layers.domain.Book;
import com.Bisan.BookShelf.layers.repository.BookRespitory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class BookShelfApplication {

	public static void main(String[] args) {

		//Class.forName("org.postgresql.Driver");
//		DataSource source =  new SimpleDriverDataSource();
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(source);
//		BookRespitory bookRespo = new BookRespitory(jdbcTemplate);
//		Book book = bookRespo.getBook(4L);
		SpringApplication.run(BookShelfApplication.class, args);


	}

}
