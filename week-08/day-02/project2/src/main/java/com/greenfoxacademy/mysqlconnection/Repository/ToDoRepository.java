package com.greenfoxacademy.mysqlconnection.Repository;

import com.greenfoxacademy.mysqlconnection.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
