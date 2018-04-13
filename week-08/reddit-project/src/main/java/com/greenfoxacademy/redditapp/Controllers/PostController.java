package com.greenfoxacademy.redditapp.Controllers;

import com.greenfoxacademy.redditapp.Model.Post;
import com.greenfoxacademy.redditapp.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

  @Autowired
  PostRepository postRepository;

  @Autowired
  Post post;

  @RequestMapping("/")
  public String listPosts(Model model){
    model.addAttribute("posts", postRepository.findAll());
    return "index";
  }

  @RequestMapping("/submit")
  public String showSubmitPage(Model model){
    model.addAttribute("emptypost", post);
    return "submit";
  }

  @PostMapping("/submit")
  public String submitNewPost(@ModelAttribute Post filledPost){
    postRepository.save(filledPost);
    return "redirect:/";
  }
}
