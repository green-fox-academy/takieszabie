package com.greenfoxacademy.redditapp.Model;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Service
public class Post {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private int rating;
  private String title;
  private String url;

  public Post() {
  }

  public Post(String title, String url) {
    this.rating = 0;
    this.title = title;
    this.url = url;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

}
