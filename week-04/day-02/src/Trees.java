import java.util.ArrayList;

public class Trees extends Plants {
  private String name;

  public Trees(String color, int waterLevel, int needsWaterLevel, double absorbCapacity, ArrayList<Trees> treeList, ArrayList<Flowers> flowerList, String name) {
    super(color, waterLevel, needsWaterLevel, absorbCapacity, treeList, flowerList);
    this.name = name;
  }
  public Trees() {
    this.name = "tree";
    this.setNeedsWaterLevel(10);
    this.setAbsorbCapacity(0.4);
  }

  public void checkWater() {
    if (getWaterLevel() < getNeedsWaterLevel()) {
      System.out.println("The " + getColor() + " " + name + " needs water.");
    } System.out.println("The " + getColor() + " " + name + " does not need water.");
  }
  public void treeWaterer(int dividedWater) {

  }
}