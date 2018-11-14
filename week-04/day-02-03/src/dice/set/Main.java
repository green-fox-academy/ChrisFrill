package dice.set;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // You have a `DiceSet` class which has a list for 6 dices
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dices until all of the dices are 6

        DiceSet diceSet = new DiceSet();

        diceSet.roll();
        System.out.println(diceSet);
        System.out.println(Arrays.toString(diceSet.getCurrent()));
        for (int i = 0; i < diceSet.dices.length; i++) {
            while (diceSet.dices[i] != 6) {
                System.out.println("The " + (i + 1) + ". dice (" + diceSet.getCurrent(i) + ") does not equals 6.");
                System.out.println("Let's reroll the " + (i + 1) + ". dice!");
                System.out.println();
                diceSet.reroll(i);
            }
        }
        System.out.println(Arrays.toString(diceSet.dices));
    }
}
