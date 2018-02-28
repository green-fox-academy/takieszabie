package com.company;

import java.awt.*;

public class PostIt {
  public static void main(String[] args) {
    PostItThing postIt1 = new PostItThing(Color.orange, Color.blue, "Idea 1");
    PostItThing postIt2 = new PostItThing(Color.pink, Color.black, "Awesome");
    PostItThing postIt3 = new PostItThing(Color.yellow, Color.green, "Superb!");
  }
}