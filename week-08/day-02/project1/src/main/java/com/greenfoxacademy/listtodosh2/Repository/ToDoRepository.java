package com.greenfoxacademy.listtodosh2.Repository;

import com.greenfoxacademy.listtodosh2.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
