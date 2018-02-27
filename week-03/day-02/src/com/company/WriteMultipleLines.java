// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {
    System.out.println("Please give me a path, a word and a number for lines!");
    Scanner questionsFromUser = new Scanner(System.in);
    String path = questionsFromUser.nextLine();
    String word = questionsFromUser.nextLine();
    int howManyLines = questionsFromUser.nextInt();

    creator(path, word, howManyLines);
  }

  private static void creator(String path, String word, int howManyLines) {
    List<String> words = new ArrayList<String>();
    for (int i = 0; i < howManyLines; i++) {
      words.add(word);
    }
    Path newPath = Paths.get(path);
    try {
      Files.write(newPath, words);
    } catch (IOException e){
      System.out.println("Errormessage");
    }
  }
}
