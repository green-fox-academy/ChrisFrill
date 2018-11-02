import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeSearcher {

    public static void main(String[] args) {
        palindromeSearcher("dog goat dad duck doodle never");
    }

    public static ArrayList<String> palindromeSearcher(String userInput) {
        ArrayList<String> palindrome = new ArrayList<String>();
        System.out.println(userInput.length());
        for (int i = 1; i < userInput.length(); i++) {
            for (int j = 1; j < i + 1; j++) {
                if (i + j >= userInput.length()) {
                    break;
                } else if (userInput.charAt(i - j) != userInput.charAt(i + j)) {
                    break;
                } else {
                    palindrome.add(userInput.substring(i - j, i + j + 1));
                    System.out.println(palindrome);
                }
            }
        }

        return palindrome;
    }
}
