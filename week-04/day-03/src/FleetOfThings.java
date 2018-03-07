import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing thing1 = new Thing("Get milk");
    Thing thing2 = new Thing("Remove the obstacles");
    Thing thing3 = new Thing("Stand up");
    Thing thing4 = new Thing("Eat lunch");

    fleet.add(thing1);
    fleet.add(thing2);
    fleet.add(thing3);
    fleet.add(thing4);

    thing3.complete();
    thing4.complete();

    System.out.println(fleet);
    List<String> fleetAsString = new ArrayList<>();
    fleetAsString.add(thing1.toString());
    fleetAsString.add(thing2.toString());
    fleetAsString.add(thing3.toString());
    fleetAsString.add(thing4.toString());
    sortFleet(fleetAsString);
    System.out.println(fleetAsString);
  }

  private static void sortFleet(List a) {
    Collections.sort(a);
  }
}