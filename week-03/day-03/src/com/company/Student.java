package com.company;

public class Student {
  private int knowledge;

  public void learn() {
    knowledge++;
    System.out.println(this + "has learnt");
  }

  public void question(Teacher teacher1) {
    teacher1.answer();
  }
}
