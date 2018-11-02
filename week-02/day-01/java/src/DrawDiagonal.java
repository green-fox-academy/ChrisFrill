import java.util.Scanner;

public class DrawDiagonal {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        // Made double diagonal.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number: ");
        int yourNumber = scanner.nextInt();

        for (int i = 0; i < yourNumber; i++) {
            for (int j = 0; j < yourNumber; j++) {
                if (i == 0) {
                    System.out.print("#");
                    if (j == yourNumber - 1) {
                        System.out.println();
                    }
                } else if (i == yourNumber - 1) {
                    System.out.print("#");
                    if (j == yourNumber - 1) {
                        System.out.println();
                    }
                } else{
                    if (j==0){
                        System.out.print("#");
                    }else if (j==yourNumber - 1){
                        System.out.print("#");
                        System.out.println();
                    }else if (i ==j){
                        System.out.print("#");
                    }else if (j ==yourNumber-i-1){
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }


                }


            }

        }
    }
}
