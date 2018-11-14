package pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship theCrimsonSun = new Ship();
        theCrimsonSun.name = "The Crimson Sun";
        theCrimsonSun.fillShip();
        System.out.println("\n" + theCrimsonSun + "\n");

        Ship theWhiteTide = new Ship();
        theWhiteTide.name = "The White Tide";
        theWhiteTide.fillShip();
        System.out.println(theWhiteTide + "\n");

        theCrimsonSun.battleShip(theWhiteTide);
        System.out.println(theCrimsonSun + "\n");
        System.out.println(theWhiteTide + "\n");
    }
}
