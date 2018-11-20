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
        for (int i = shipStart; i < ships.size(); i++) {
            for (int j = enemyShipStart; j < otherArmada.ships.size(); j++) {
                if (ships.get(i).battleShip(otherArmada.ships.get(j))) {
                    enemyShipStart++;
                    System.out.println("Awesome! The first armada's " + (shipStart + 1) +
                            " ship has won against second armada's " + enemyShipStart
                            + ". ship.");
                } else {
                    shipStart++;
                    System.out.println("Oh, no! The first armada's " + shipStart +
                            " ship has lost against second armada's " + (enemyShipStart + 1)
                            + ". ship.");
                }
                if (shipStart > ships.size() - 1) {
                    System.out.println("\nDid the first armada win the war?");
                    return false;
                } else if (enemyShipStart > otherArmada.ships.size() - 1 ) {
                    System.out.println("\nDid the first armada win the war?");
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
