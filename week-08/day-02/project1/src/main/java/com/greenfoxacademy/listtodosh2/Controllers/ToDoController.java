package com.greenfoxacademy.listtodosh2.Controllers;

import com.greenfoxacademy.listtodosh2.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @Autowired
  ToDoRepository toDoRepository;

  @RequestMapping(value = {"/", "/list"})
  @ResponseBody
  public String list(Model model) {
    model.addAttribute("todos", toDoRepository);
    return "todolist";
  }
}
