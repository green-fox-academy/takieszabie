package com.greenfoxacademy.listtodosh2;

import com.greenfoxacademy.listtodosh2.Model.ToDo;
import com.greenfoxacademy.listtodosh2.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Listtodosh2Application implements CommandLineRunner{
	@Autowired
	ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Listtodosh2Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		List<ToDo> toDoList = Arrays.asList(
						toDoRepository.save(new ToDo("Feed dog")),
						toDoRepository.save(new ToDo("Love wife")),
						toDoRepository.save(new ToDo("Call mum")),
						toDoRepository.save(new ToDo("Play guitar"))
		);
	}
}
