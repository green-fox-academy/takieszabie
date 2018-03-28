import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.time.LocalDateTime.now;

public class ToDo {
  private static final String CHECKED_BOX = " [X] ";
  private static final String UNCHECKED_BOX = " [ ] ";
  private static String FILE_PATH = "..//data.txt";
  private String title;
  private static int idBase = 1;
  private int id;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;
  private boolean isCompleted;

  private List<ToDo> toDoList = new ArrayList<>();

  public ToDo() {
    this.title = title;
    this.id = id;
    this.createdAt = createdAt;
    this.completedAt = completedAt;
    this.isCompleted = isCompleted;
  }

  public String getTitle() {
    return title;
  }

  public int getId() {
    return id;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getCompletedAt() {
    return completedAt;
  }

  public boolean isCompleted() {
    return isCompleted;
  }

  public ToDo(String title) {
    this.title = title;
    this.id = idBase++;
    this.createdAt = now();
  }

  FileOperations fileOperator = new FileOperations();

  public void printToDoS() {
    List<String> toBePrintedAsString = fileOperator.getFileContent(FILE_PATH);
    List<ToDo> toBePrintedAsToDo = new ArrayList<>();
    if (toBePrintedAsString.size() < 1) {
      System.out.println("No ToDo's for today! :)");
    } else {
      for (int i = 0; i < toBePrintedAsString.size(); i++) {
        String[] linesSeparated = toBePrintedAsString.get(i).split("///");
        toBePrintedAsToDo.add(new ToDo(linesSeparated[1]));
      }
    }
  }

  public void addToDo() {
    Scanner toDoFromUser = new Scanner(System.in);
    String newToDo = toDoFromUser.nextLine();
    ToDo addedToDo = new ToDo(newToDo);
    String fileInsert = addedToDo.getId() + "///";
    if (addedToDo.isCompleted) {
      fileInsert = fileInsert + CHECKED_BOX + "///";
    } else {
      fileInsert = fileInsert + UNCHECKED_BOX + "///";
    } fileInsert = fileInsert + newToDo + "///" + getCreatedAt();
    List<String> fileContentText = new ArrayList<>();
    fileContentText.add(fileInsert);
    fileOperator.writeFile(FILE_PATH, fileContentText);
  }
}
