import java.util.Scanner;

public class CowsAndBulls {
    private int number;
    private String status;
    private int counter;

    public CowsAndBulls() {
        this.number = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
        this.status = "playing";
        this.counter = 0;
    }

    public static void main(String[] args) {
        CowsAndBulls cowsAndBulls = new CowsAndBulls();
        cowsAndBulls.play();
    }

    public void play() {
        while (!status.equals("finished")) {
            String guess = getInput();
            if (guess.equals("cow cow cow cow ")) {
                status = "finished";
            }
        }
        System.out.printf("Congrats! You guessed %d times\n", counter);
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 4 digit number.");
        int input = scanner.nextInt();
        String guess = guess(input);
        System.out.println(guess);
        counter++;
        return guess;
    }

    public String guess(int input) {
        String inputString = Integer.toString(input);
        String numberString = Integer.toString(number);
        String returnString = "";
        for (int i = 0; i < 4; i++) {
            if (inputString.charAt(i) == numberString.charAt(i)) {
                returnString += "cow ";
            } else if (numberString.contains("" + inputString.charAt(i))) {
                returnString += "bull ";
            } else {
                returnString += inputString.charAt(i) + " ";
            }
        }
        return returnString;
    }
}
