import java.util.Scanner;

public class DrawChessTable {
    // Crate a program that draws a chess table like this
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    //
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number: ");
        int yourNumber = scanner.nextInt();


        for (int i = 0; i<yourNumber; i++){
            for (int j = 0; j<9; j++){
                if (i % 2 == 0){
                    if (j % 2 == 0){
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if (j % 2 == 0){
                        System.out.print(" ");
                    }else{
                        System.out.print("#");
                    }
                }


            }
            System.out.println();
        }
    }
}
