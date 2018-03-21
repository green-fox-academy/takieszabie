package com.company;

public class Teacher {
  private int numberOfLessons;

  public void answer() {
    numberOfLessons++;
    System.out.println(this + " has answered");
  }
  public void teach(Student student1) {
    student1.learn();
  }
}
