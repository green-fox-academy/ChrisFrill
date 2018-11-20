package pirates;

import java.util.Random;

public class Pirate {
    int intoxicated;
    String position;

    public Pirate() {
        intoxicated = 0;
    }

    public void drinkSomeRum() {
        if (intoxicated >= 0) {
            intoxicated++;
        } else {
        }
    }

    public void howsItGoingMate() {
        if (intoxicated < 0) {
            System.out.println("He is dead.");
        } else if (intoxicated < 5) {
            System.out.println("Pour me anudder");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void die() {
        intoxicated = -1;
    }

    public void brawl(Pirate otherPirate) {
        if (intoxicated >= 0 && otherPirate.intoxicated >= 0) {
            int random = (int) (1 + Math.random() * 3);

            switch (random) {
                case 1:
                    intoxicated = -1;
                    System.out.println("Oh, no! The first pirate has died.");
                    break;

                case 2:
                    otherPirate.intoxicated = -1;
                    System.out.println("Oh, no! The second pirate has died.");
                    break;

                case 3:
                    intoxicated = -1;
                    otherPirate.intoxicated = -1;
                    System.out.println("Oh, no! Both pirates have died.");
                    break;
            }
        }
    }
    @Override
    public String toString() {
        return "Pirate{" +
                "intoxicated=" + intoxicated +
                ", position='" + position + '\'' +
                '}';
    }
}
