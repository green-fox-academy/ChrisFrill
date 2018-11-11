import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeSearcher {

    public static void main(String[] args) {
        System.out.println(palindromeSearcher("dog goat dad duck doodle never"));
    }

    public static ArrayList<String> palindromeSearcher(String userInput) {
        ArrayList<String> palindrome = new ArrayList<String>();
        for (int i = 1; i < userInput.length(); i++) {
            for (int j = 1; j < i + 1; j++) {
                if (i + j >= userInput.length()) {
                    break;
                } else if (userInput.charAt(i - j) != userInput.charAt(i + j)) {
                    break;
                } else {
                    palindrome.add(userInput.substring(i - j, i + j + 1));
                }
            }
        }
        for (int i = 1; i < userInput.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (i + j + 2 > userInput.length()) {
                    break;
                } else if (userInput.charAt(i - j) != userInput.charAt(i + j + 1)) {
                    break;
                } else if (userInput.substring(i - j, i + j + 2).length() >= 4) {
                    palindrome.add(userInput.substring(i - j, i + j + 2));
                }
            }
        }
        return palindrome;
    }

}
