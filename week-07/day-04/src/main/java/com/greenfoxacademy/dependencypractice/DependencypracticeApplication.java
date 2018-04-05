package com.greenfoxacademy.dependencypractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencypracticeApplication implements CommandLineRunner {

	@Autowired
	Printer printer;

	@Autowired
	MyColor myColor;

	public static void main(String[] args) {
		SpringApplication.run(DependencypracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		printer.log("hello");
		myColor.printColor();
		printer.log(myColor.printColor());
	}
}
