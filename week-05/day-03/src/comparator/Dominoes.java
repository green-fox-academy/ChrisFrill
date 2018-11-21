package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes{

    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        Collections.sort(dominoes);
        System.out.println(dominoes);
        orderDominoes(dominoes);
        System.out.println(dominoes);

        for (Domino d : dominoes) {
            d.printAllFields();
        }

    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    public static List<Domino> orderDominoes(List<Domino> dominoes) {
        Domino temp;
        for (int i = 0; i < dominoes.size() - 1; i++) {
            for (int j = 0; j < dominoes.size(); j++) {
                if (dominoes.get(i).getRightSide() == dominoes.get(j).getLeftSide()) {
                    temp = dominoes.get(i + 1);
                    dominoes.set(i + 1, dominoes.get(j));
                    dominoes.set(j, temp);
                }
            }
        }
        return dominoes;
    }
}
