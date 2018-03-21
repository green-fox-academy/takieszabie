import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private int ammoStore;
  private int healthPoints;
  private List<Aircraft> aircraftStore;

  public Carrier(int ammoStore, int healthPoints) {
    this.ammoStore = ammoStore;
    this.healthPoints = healthPoints;
    this.aircraftStore = new ArrayList<>();
  }

  public void add(Aircraft aircraft1) {
    aircraftStore.add(aircraft1);
  }

  public void fill() {
    int totalAmmoNeeded = 0;
    for (int i = 0; i < aircraftStore.size(); i++) {
      totalAmmoNeeded = totalAmmoNeeded + aircraftStore.get(i).getMaxAmmo() - aircraftStore.get(i).getAmmoNumber();
    }
    if (ammoStore <= 0) {
      System.out.println("Exception: ammo is out");
    } else if (totalAmmoNeeded < ammoStore) {
      for (int i = 0; i < aircraftStore.size(); i++) {
        if (ammoStore > (aircraftStore.get(i).getMaxAmmo() - aircraftStore.get(i).getAmmoNumber())) {
          if (aircraftStore.get(i) instanceof F35) {
            ammoStore = ammoStore - aircraftStore.get(i).getMaxAmmo() + aircraftStore.get(i).getAmmoNumber();
            aircraftStore.get(i).refiller(aircraftStore.get(i).getMaxAmmo() - aircraftStore.get(i).getAmmoNumber());
          } else {
            ammoStore = ammoStore - aircraftStore.get(i).getMaxAmmo() + aircraftStore.get(i).getAmmoNumber();
            aircraftStore.get(i).refiller(aircraftStore.get(i).getMaxAmmo() - aircraftStore.get(i).getAmmoNumber());
          }
        } else {
          System.out.println("We ran out of ammo");
        }
      }
    }
  }

  public void fight(Carrier carrier1) {
    int attackerTotalDamage = 0;
    int attackedTotalDamage = 0;
    for (int i = 0; i < this.aircraftStore.size(); i++) {
      attackerTotalDamage = attackerTotalDamage + this.aircraftStore.get(i).getAmmoNumber()*this.aircraftStore.get(i).getBaseDamage();
    }
    for (int i = 0; i < carrier1.aircraftStore.size(); i++) {
      attackedTotalDamage = attackedTotalDamage + carrier1.aircraftStore.get(i).getAmmoNumber()*carrier1.aircraftStore.get(i).getBaseDamage();
    }
    this.healthPoints = this.healthPoints - attackedTotalDamage;
    carrier1.healthPoints = carrier1.healthPoints - attackerTotalDamage;
  }
}
