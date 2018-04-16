package com.greenfoxacademy.frontend.Models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DouledResponse {
  private Integer received;
  private Integer result;
  private String error;

  public DouledResponse(Integer received) {
    this.received = received;
    result = received*2;
  }

  public DouledResponse() {
    error = "Please provide an input!";
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
