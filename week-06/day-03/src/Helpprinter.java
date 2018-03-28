public class Helpprinter {
  public static void print() {
    System.out.println("Todo Application Help");
    System.out.println("=====================\n");
    System.out.println("Usage: Todo [option] [description]\n");
    System.out.println("Command line options:");
    System.out.println("-l, --list            // Lists all the tasks");
    System.out.println("-a, --add             // Adds a new task");
    System.out.println("-r, --remove          // Removes a task");
    System.out.println("-c, --complete       // Set task as completed");
    System.out.println("-h, --help            // Displays this screen");
  }
}