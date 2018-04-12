package com.greenfoxacademy.mysqlconnection;

import com.greenfoxacademy.mysqlconnection.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlconnectionApplication implements CommandLineRunner {
  @Autowired
  ToDoRepository toDoRepository;

  public static void main(String[] args) {
    SpringApplication.run(MysqlconnectionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
