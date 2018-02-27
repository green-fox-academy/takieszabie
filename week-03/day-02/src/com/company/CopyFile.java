// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CopyFile {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please give me the source file's name!");
    String sourceName = userInput.nextLine();
    System.out.println("Please give me the target file's name!");
    String targetName = userInput.nextLine();
    Path sourcePath = Paths.get(sourceName);
    Path targetPath = Paths.get(targetName);
    System.out.println(copier(sourcePath, targetPath));
  }

  private static boolean copier(Path sourcePath, Path targetPath) {
    try {
      Files.copy(sourcePath, targetPath);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}