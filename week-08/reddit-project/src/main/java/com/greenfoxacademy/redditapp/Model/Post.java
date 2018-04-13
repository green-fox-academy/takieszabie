package com.greenfoxacademy.redditapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private int rating;
  private String title;

  public Post(String title) {
    this.rating = 0;
    this.title = title;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
