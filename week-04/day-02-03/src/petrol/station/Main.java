package petrol.station;

public class Main {
    public static void main(String[] args) {

        Station mol = new Station();
        Car hummer = new Car();
        System.out.println(hummer.capacity);
        System.out.println(hummer.gasAmount);
        System.out.println(mol.gasAmount);
        System.out.println();

        mol.refill(hummer);
        System.out.println(hummer.capacity);
        System.out.println(hummer.gasAmount);
        System.out.println(mol.gasAmount);


    }
}
