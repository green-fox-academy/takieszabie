package com.greenfoxacademy.redditapp;

import com.greenfoxacademy.redditapp.Model.Post;
import com.greenfoxacademy.redditapp.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditappApplication implements CommandLineRunner{

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(RedditappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		postRepository.save(new Post("How to sell yourself on LNKD"));
		postRepository.save(new Post("How to sell yourself on LNKD2"));
		postRepository.save(new Post("How to sell yourself on LNKD3"));

	}
}
