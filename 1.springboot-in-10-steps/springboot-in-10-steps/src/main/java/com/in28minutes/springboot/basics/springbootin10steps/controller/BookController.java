package com.in28minutes.springboot.basics.springbootin10steps.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.basics.springbootin10steps.model.Book;

@RestController
public class BookController {

	@GetMapping("/books")
	public List<Book> getListOfBooks() {

		return Arrays.asList(new Book(1, "MAstering springboot5", "gyan"));
	}

}
