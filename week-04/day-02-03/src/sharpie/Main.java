package sharpie;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sharpie blue = new Sharpie("blue", 77);
        System.out.println(blue.color);
        System.out.println(blue.width);
        System.out.println(blue.inkAmount);
        System.out.println();

        blue.use();
        System.out.println(blue.inkAmount);
        System.out.println();

        Sharpie yellow = new Sharpie("yellow", 12 );
        yellow.inkAmount = 0;
        System.out.println(yellow.inkAmount);
        System.out.println();

        Sharpie black = new Sharpie("black", 2);
        System.out.println(black.inkAmount);

        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.add(blue);
        sharpieSet.add(yellow);
        sharpieSet.add(black);
        System.out.println(sharpieSet);
        System.out.println(sharpieSet.countUsable());

        sharpieSet.removeTrash();
        System.out.println(sharpieSet);

    }
}
