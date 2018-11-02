import java.util.Arrays;
import java.util.Random;

public class Seating {
    public static void main(String[] args){
        String[] students = {"András", "Archie", "Betti", "Chika", "Csongi", "Dani", "Diana", "Dóri", "Enikő", "Gábor", "Krisz", "Lili", "Márk", "Peti L.", "Peti R.", "Pityu", "Sol", "Tomi", "Zoli", "Zsolt", "Zsuzsa"};
        System.out.println("The class: " +Arrays.toString(students));
        shuffleArray(students);
        System.out.println("After shuffling: " + Arrays.toString(students));
        seating(students);
    }

    public static String[] shuffleArray(String[] array){
        Random rand = new Random();
        for (int i = 0; i <array.length; i++ ){
            int random = rand.nextInt(array.length);
            String temp = array[i];
            array[i] = array[random];
            array[random] = temp;
        }
        return array;
    }

    public static String[] seating(String[] array){
        int pairNumber  = 1;
        for (int i = 0; i < array.length; i +=2){
            if (i == array.length-1){
                System.out.println("The winner is: " + array[array.length-1]);
            }else {
                System.out.print((pairNumber) + ". pair: " + array[i] + " & " + array[i+1] + "\n");
                pairNumber += 1;
            }
        }
        return array;
    }
}