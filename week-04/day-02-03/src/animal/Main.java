package animal;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        System.out.println(lion.hunger);
        lion.play();
        System.out.println(lion.hunger + " " +lion.thirst);
        lion.drink();
        lion.eat();
        System.out.println(lion.hunger + " " +lion.thirst + "\n");


        Farm farm = new Farm();
        System.out.println(farm);
        farm.add(lion);
        System.out.println(farm);
        farm.get(0).eat();
        System.out.println(farm);
        farm.breed();
        farm.breed();
        farm.breed();
        farm.get(1).eat();
        farm.get(1).eat();
        farm.get(1).eat();
        farm.get(1).eat();
        System.out.println(farm);
        farm.slaughter();
        System.out.println(farm);
    }
}
