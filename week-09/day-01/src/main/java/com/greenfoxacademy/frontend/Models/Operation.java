package com.greenfoxacademy.frontend.Models;

public class Operation {
  private long until;
  private long result;
  private String error;

  public Operation(long until) {
    this.until = until;
    this.result = 0;
  }

  public Operation() {
    error = "Please provide a number!";
  }

  public long getUntil() {
    return until;
  }

  public void setUntil(long until) {
    this.until = until;
  }

  public long getResult() {
    return result;
  }

  public void setResult(long result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
