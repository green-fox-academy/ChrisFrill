package comparator;

import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing milk = new Thing("Get Milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand up");
        standUp.complete();
        Thing eat = new Thing("Eat lunch");
        eat.complete();

        fleet.add(milk);
        fleet.add(obstacles);
        fleet.add(standUp);
        fleet.add(eat);

        System.out.println(fleet);

        Collections.sort(fleet.getThings());
        System.out.println(fleet);

        for (Thing t : fleet.getThings()) {
            t.printAllFields();
        }
    }
}