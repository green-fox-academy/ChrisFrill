import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number: ");
        int yourNumber = scanner.nextInt();
        String star = "*";

        for(int i=0;i<yourNumber;i++) {
            for(int j=0;j<yourNumber-i;j++){
                System.out.print(" ");
            }
            System.out.println(star);
            star += "**";
        }

        star = "*";
        String doubleStar = "**";

        for(int i=1;i<yourNumber;i++){
            for(int j = 0;j < i + 1;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<yourNumber;k++){
                if (k == 1){
                System.out.print(star);
            }else {
                    System.out.print(doubleStar);
                }
            }

        }
        }
    }

