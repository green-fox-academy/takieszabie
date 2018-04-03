import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
  private List<ToDo> toDoList = new ArrayList<>();
  private static final String CHECKED_BOX = " [X] ";
  private static final String UNCHECKED_BOX = " [ ] ";
  private static String FILE_PATH = "..//data.txt";

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
    System.out.println(toBePrintedAsString);
  }

  public void addToDo() {
    System.out.println("What kind of ToDo would you like to add?");
    Scanner toDoFromUser = new Scanner(System.in);
    String newToDo = toDoFromUser.nextLine();
    List<String> fileContentText = fileOperator.getFileContent(FILE_PATH);
    ToDo addedToDo = new ToDo(newToDo);
    toDoList.add(addedToDo);
    String fileInsert = addedToDo.getId() + "///";
    if (addedToDo.getIsCompleted()) {
      fileInsert = fileInsert + CHECKED_BOX + "///";
    } else {
      fileInsert = fileInsert + UNCHECKED_BOX + "///";
    } fileInsert = fileInsert + newToDo + "///" + addedToDo.getCreatedAt();
    fileContentText.add(fileInsert);
    fileOperator.writeFile(FILE_PATH, fileContentText);
  }
}
