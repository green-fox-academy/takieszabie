package com.greenfoxacademy.redditapp.Repository;

import com.greenfoxacademy.redditapp.Model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
