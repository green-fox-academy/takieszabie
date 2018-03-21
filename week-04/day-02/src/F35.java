public class F35 extends Aircraft {
  private static final int AMMO_NUMBER = 0;
  private static final int MAX_AMMO = 12;
  private static final int BASE_DAMAGE = 50;

  public F35() {
    super(AMMO_NUMBER, MAX_AMMO, BASE_DAMAGE, true, "F35");
  }
}
