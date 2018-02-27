// Write a program that opens a file called "my-file.txt", then prints
// each of lines form the file.
// If the program is unable to read the file (for example it does not exists),
// then it should print an error message like: "Unable to read file: my-file.txt"

package com.company;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main (String[] args) {

    try {
      Path szabolcsPath = Paths.get("my-file.txt");
      List<String> linesOfFile = Files.readAllLines(szabolcsPath);
      for (int i = 0; i < linesOfFile.size() ; i++) {
        System.out.println(linesOfFile.get(i));
      }
    }
    catch (Exception e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}