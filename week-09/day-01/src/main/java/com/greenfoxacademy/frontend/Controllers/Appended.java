package com.greenfoxacademy.frontend.Controllers;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Appended {
  private String toBeAppended;
  private String appended;

  public Appended(String toBeAppended) {
    appended = toBeAppended + "a";
  }

  public String getToBeAppended() {
    return toBeAppended;
  }

  public void setToBeAppended(String toBeAppended) {
    this.toBeAppended = toBeAppended;
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
