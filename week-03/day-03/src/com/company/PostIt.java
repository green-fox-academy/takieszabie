package com.company;

import java.awt.*;

public class PostIt {
  public static void main(String[] args) {

    PostItThings postIt1 = new PostItThings();
    postIt1.backgroundColor = Color.orange;
    postIt1.textColor = Color.blue;
    postIt1.textOnIt = "Idea 1";

    PostItThings postIt2 = new PostItThings();
    postIt1.backgroundColor = Color.pink;
    postIt1.textColor = Color.black;
    postIt1.textOnIt = "Awesome";

    PostItThings postIt3 = new PostItThings();
    postIt1.backgroundColor = Color.yellow;
    postIt1.textColor = Color.green;
    postIt1.textOnIt = "Superb!";
  }
}

class PostItThings {

  Color backgroundColor;
  Color textColor;
  String textOnIt;

}