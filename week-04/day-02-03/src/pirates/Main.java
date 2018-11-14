package pirates;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pirate halfEyedJoe = new Pirate();
        Pirate oneLeggedBob = new Pirate();

        for (int i = 0; i < 6; i++) {
            halfEyedJoe.drinkSomeRum();
            halfEyedJoe.howsItGoingMate();
        }

        halfEyedJoe.die();
        halfEyedJoe.drinkSomeRum();
        halfEyedJoe.howsItGoingMate();

        halfEyedJoe.intoxicated = 0;

        halfEyedJoe.brawl(oneLeggedBob);

        Parrot parrot = new Parrot();
    }
}
