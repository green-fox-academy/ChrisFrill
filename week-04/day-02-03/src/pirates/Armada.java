package pirates;

import java.util.ArrayList;

public class Armada {
    ArrayList<Ship> ships;

    public Armada() {
        ships = new ArrayList<>();
    }

    public void fillArmada() {
        int random = (int) (1 + Math.random() * 10);
        for (int i = 0; i < random; i++) {
            Ship ship = new Ship();
            ship.name = (i + 1) + ".";
            ship.fillShip();
            ships.add(ship);
        }
    }

    public boolean battleArmada(Armada otherArmada) {
        int enemyShipStart = 0;
        int shipStart = 0;
        for (int i = 0; i < ships.size(); i++) {
            for (int j = enemyShipStart; j < otherArmada.ships.size(); j++) {
                if (ships.get(i).battleShip(otherArmada.ships.get(j))) {
                    System.out.println("Awesome! The first armada's " + ships.get(i).name +
                            " ship has won against second armada's " + otherArmada.ships.get(j).name
                            + " ship.");
                    enemyShipStart++;
                } else {
                    System.out.println("Oh, no! The first armada's " + ships.get(i).name +
                            " ship has lost against second armada's " + otherArmada.ships.get(j).name
                            + " ship.");
                    shipStart++;
                }
                if (shipStart > ships.size() - 1) {
                    System.out.println("Did the first armada win the war?");
                    return false;
                } else if (enemyShipStart > otherArmada.ships.size() - 1 ) {
                    System.out.println("Did the first armada win the war?");
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nThe armada: " +
                ships;
    }
}
