public class GameControl {
  public static void main(String[] args) {
    Carrier ussNimitz = new Carrier(5000,5000);
    Carrier ussNevada = new Carrier(5000, 5000);

    Aircraft F35_1 = new F35();
    Aircraft F35_2 = new F35();
    Aircraft F16_1 = new F16();
    Aircraft F16_2 = new F16();

    ussNevada.add(F16_1);
    ussNevada.add(F35_1);
    ussNimitz.add(F16_2);
    ussNimitz.add(F35_2);

    ussNevada.fill();
    ussNimitz.fill();

    ussNevada.fight(ussNimitz);
    ussNevada.fight(ussNimitz);
    ussNevada.fight(ussNimitz);

    ussNevada.printStatus();
    ussNimitz.printStatus();
  }
}
