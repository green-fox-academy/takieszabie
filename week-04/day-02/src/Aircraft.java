public class Aircraft {
  private int ammoNumber;
  private int maxAmmo;
  private int baseDamage;
  private boolean isPriority;
  private String type;

  public Aircraft(int ammoNumber, int maxAmmo, int baseDamage, boolean isPriority, String type) {
    this.ammoNumber = ammoNumber;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.isPriority = isPriority;
    this.type = type;
  }

  public void setAmmoNumber(int ammoNumber) {
    this.ammoNumber = ammoNumber;
  }

  public int getAmmoNumber() {
    return ammoNumber;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public boolean isPriority() {
    return isPriority;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type " + getType()+ ", Ammo: " + getAmmoNumber() + ", Base Damage: " + getBaseDamage() + ", All Damage: " + getAmmoNumber()*getBaseDamage();
  }

  public int fight(Aircraft aircraft1){
    int damage = aircraft1.getAmmoNumber()*aircraft1.getBaseDamage();
    aircraft1.setAmmoNumber(0);
    return damage;
  }
  public int refiller (int refill) {
    if (getAmmoNumber() >= getMaxAmmo()) {
      return refill;
    } else if (refill < getMaxAmmo()) {
      setAmmoNumber(refill);
      return 0;
    } else {
      int restFromRefill = refill + getAmmoNumber()-getMaxAmmo();
      setAmmoNumber(getMaxAmmo());
      return restFromRefill;
    }
  }
}
