package com.greenfoxacademy.mysqlconnection.Model;

import com.greenfoxacademy.mysqlconnection.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ToDoService {
  @Autowired
  ToDoRepository toDoRepository;

  public void addToDo(ToDo toDo) {
    toDoRepository.save(toDo);
  }
}
