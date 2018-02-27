// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    String szabolcsFileName = "anything.txt";
    System.out.println(countlines(szabolcsFileName));
  }

  private static int countlines(String szabolcsFileName) {
    try {
      Path szabiPath = Paths.get(szabolcsFileName);
      List<String> linesOfFile = Files.readAllLines(szabiPath);
      return linesOfFile.size();
    } catch (Exception e) {
        return 0;
    }
  }
}