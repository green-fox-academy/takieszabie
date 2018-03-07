public class Student extends Person implements Cloneable{
  private String previousOrganization;
  private int skippedDays;

  public Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }
  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }
  public Student(String previousOrganization, int skippedDays) {
    this.previousOrganization = previousOrganization;
    this.skippedDays = skippedDays;
  }
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from "
            + previousOrganization + " who skipped " + skippedDays + "days from the course already.");
  }
  public void getGoal() {
    System.out.println("Be a junior software developer!");
  }
  public int skipDays(int numberOfDays) {
    return numberOfDays + skippedDays;
  }
  public Object clone()throws CloneNotSupportedException {
    return super.clone();
  }

}