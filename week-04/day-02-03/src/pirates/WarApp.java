package pirates;

public class WarApp {

    public static void main(String[] args) {
        Armada armada = new Armada();
        armada.fillArmada();
        Armada armada2 = new Armada();
        armada2.fillArmada();
        System.out.println(armada);
        System.out.println(armada2);

        System.out.println(armada.battleArmada(armada2));

        new Parrot();
    }
}
