import java.util.ArrayList;

public class Plants extends GardenMain{
  private String color;
  private int waterLevel;
  private int needsWaterLevel;
  private double absorbCapacity;

  private ArrayList<Trees> TreeList = new ArrayList<>();
  private ArrayList<Flowers> FlowerList = new ArrayList<>();

  public Plants(String color, int waterLevel, int needsWaterLevel, double absorbCapacity, ArrayList<Trees> treeList, ArrayList<Flowers> flowerList) {
    this.color = color;
    this.waterLevel = waterLevel;
    this.needsWaterLevel = needsWaterLevel;
    this.absorbCapacity = absorbCapacity;
    TreeList = treeList;
    FlowerList = flowerList;
  }
  public Plants(){
    this.waterLevel = 0;
    this.needsWaterLevel = 0;
    this.absorbCapacity = 0.1;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(int waterLevel) {
    this.waterLevel = waterLevel;
  }

  public int getNeedsWaterLevel() {
    return needsWaterLevel;
  }

  public void setNeedsWaterLevel(int needsWaterLevel) {
    this.needsWaterLevel = needsWaterLevel;
  }

  public double getAbsorbCapacity() {
    return absorbCapacity;
  }

  public void setAbsorbCapacity(double absorbCapacity) {
    this.absorbCapacity = absorbCapacity;
  }

  public ArrayList<Trees> getTreeList() {
    return TreeList;
  }

  public void setTreeList(ArrayList<Trees> treeList) {
    TreeList = treeList;
  }

  public ArrayList<Flowers> getFlowerList() {
    return FlowerList;
  }

  public void setFlowerList(ArrayList<Flowers> flowerList) {
    FlowerList = flowerList;
  }
  public void waterer(int water){
    int divider = TreeList.size() + FlowerList.size();
    int dividedWater = water/divider;
    //flowerWaterer(dividedWater);
    //Trees.treeWaterer(dividedWater);
  }
}