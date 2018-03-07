public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing o) {
    if (completed == o.completed) {
      if (name.charAt(0) == o.name.charAt(0)) {
        return 0;
      } else if (name.charAt(0) > o.name.charAt(0)) {
        return -1;
      } else return 1;
    } else {
      if (name.charAt(0) == o.name.charAt(0)) {
        return 0;
      } else if (name.charAt(0) > o.name.charAt(0)) {
        return -1;
      } else return 1;
    }
  }
}