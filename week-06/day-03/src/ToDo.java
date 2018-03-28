import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ToDo {
  private static String FILE_PATH = "..//data.txt";
  FileOperations fileOperator = new FileOperations();

  public void printToDoS() {
    List<String> toBePrinted = fileOperator.getFileContentAsList(FILE_PATH);
    for (int i = 0; i < toBePrinted.size(); i++) {
      System.out.println(toBePrinted.get(i));
    }
  }
}
