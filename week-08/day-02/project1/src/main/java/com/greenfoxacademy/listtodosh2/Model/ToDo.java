package com.greenfoxacademy.listtodosh2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToDo {

  @Id
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;


public ToDo(long id, String title) {
    this.id = id;
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }


}
