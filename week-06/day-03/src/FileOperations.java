import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
  public List<String> getFileContentAsList(String fileName) {
    List<String> linesOfFile = new ArrayList<>();
    try {
      Path filePath = Paths.get(fileName);
      linesOfFile = Files.readAllLines(filePath);
    } catch (IOException e1) {
      e1.printStackTrace();
    }
    return linesOfFile;
  }
}
