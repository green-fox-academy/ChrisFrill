package pirates;

import java.util.ArrayList;

public class Ship {
    ArrayList<Pirate> pirates;
    String name;
    int battlesWon;

    public Ship() {
        pirates = new ArrayList<>();
        battlesWon = 0;
    }

    public void fillShip() {
        Pirate captain = new Pirate();
        captain.position = "Captain";
        pirates.add(captain);
        captain.intoxicated = (int) (Math.random() * 10);

        int random = (int) (1 + Math.random() * 100);

        for (int i = 0; i < random; i++) {
            Pirate pirate = new Pirate();
            pirate.position = "Crew";
            pirates.add(pirate);
        }
    }

    public String getCaptainState() {
        String captainState = "";
        for (Pirate pirate : pirates) {
            if (pirate.position.contains("Captain")) {
                if (pirate.intoxicated >= 0) {
                    captainState = "alive";
                } else {
                    captainState = "dead";
                }
            }
        }
        return captainState;
    }

    public int getCaptainRumConsumption() {
        int rumConsumption = 0;
        for (Pirate pirate : pirates) {
            if (pirate.position.equals("Captain") && pirate.intoxicated >= 0) {
                rumConsumption = pirate.intoxicated;
            }
        }
        return rumConsumption;
    }

    public int getAlive() {
        int alive = 0;
        for (Pirate pirate : pirates) {
            if (pirate.intoxicated >= 0 && pirate.intoxicated < 5) {
                alive++;
            }
        }
        return alive;
    }

    public boolean battleShip(Ship otherShip) {
        int thisShipScore = getAlive() - getCaptainRumConsumption();
        int otherShipScore = otherShip.getAlive() - otherShip.getCaptainRumConsumption();

        if (thisShipScore > otherShipScore) {
            otherShip.loseSomeCrew();
            drinkRandomRum();
            battlesWon++;
            return true;
        } else if (thisShipScore == otherShipScore) {
            if (flipACoin()) {
                otherShip.loseSomeCrew();
                drinkRandomRum();
                battlesWon++;
                return true;
            }
            loseSomeCrew();
            otherShip.drinkRandomRum();
            otherShip.battlesWon++;
            return false;
        }
        loseSomeCrew();
        otherShip.drinkRandomRum();
        otherShip.battlesWon++;
        return false;
    }

    public boolean flipACoin() {
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            return false;
        }
        return true;
    }

    public void loseSomeCrew() {
        for (Pirate pirate : pirates) {
            if (flipACoin()) {
                pirate.die();
            }
        }
    }

    public void drinkRandomRum() {
        for (Pirate pirate : pirates) {
            int random = (int) (Math.random() * 5);
            for (int i = 0; i < random; i++) {
                pirate.drinkSomeRum();
            }
        }
    }
    @Override
    public String toString() {
        return "\nThe " + name + " ship has "
                + getAlive() + " alive and well pirates in the crew. Ahoy!\n" +
                "The captain consumed " + getCaptainRumConsumption() + " rum.\n" +
                "The captain is " + getCaptainState() + ".\n" +
                "Battles won: " + battlesWon + ".\n";
    }
}
