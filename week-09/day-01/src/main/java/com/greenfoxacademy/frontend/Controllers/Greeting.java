package com.greenfoxacademy.frontend.Controllers;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Greeting {
  private String name;
  private String title;
  private String error;
  private String welcome_message;

  public Greeting() {
    error = "Please provide a name!";
  }

  public Greeting(String name, String title) {
    welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
