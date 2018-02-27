// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"

package com.company;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.write;

public class WriteSingleLine {
  public static void main(String[] args) {
    List<String> szabiName = new ArrayList<>();
    szabiName.add("Szabolcs Takács");
    Path szabiPath = Paths.get("my-file.txt");

    try {
      Files.write(szabiPath, szabiName);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}