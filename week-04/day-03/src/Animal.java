public abstract class Animal {
  private String name;
  private int age;
  private String gender;
  private String color;
  private int height;

  public abstract String breed();

  public void grow() {
  }

  public String getName() {
    return name;
  }

  public Animal(String name) {
    this.name = name;
  }
}