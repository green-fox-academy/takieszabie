package com.greenfoxacademy.dependencypractice;

import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

  @Override
  public String printColor() {
    return "This is BLUE in color!";
  }
}
