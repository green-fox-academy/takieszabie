import java.util.ArrayList;

public class Flowers extends Plants {
  private String name;

  public Flowers(String color, int waterLevel, int needsWaterLevel, double absorbCapacity, ArrayList<Trees> treeList, ArrayList<Flowers> flowerList, String name) {
    super(color, waterLevel, needsWaterLevel, absorbCapacity, treeList, flowerList);
    this.name = name;
  }

  public Flowers() {
    this.name = "flower";
    this.setNeedsWaterLevel(5);
    this.setAbsorbCapacity(0.75);
  }

  public void checkWater() {
    if (getWaterLevel() < getNeedsWaterLevel()) {
      System.out.println("The " + getColor() + " " + name + " needs water.");
    } System.out.println("The " + getColor() + " " + name + " does not need water.");
  }
}