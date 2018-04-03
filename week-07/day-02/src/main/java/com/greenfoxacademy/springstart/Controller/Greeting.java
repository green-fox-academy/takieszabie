package com.greenfoxacademy.springstart.Controller;

public class Greeting {
  long Id;
  String content;

  public Greeting(long id, String content) {
    Id = id;
    this.content = content;
  }

  public long getId() {
    return Id;
  }

  public String getContent() {
    return content;
  }
}
