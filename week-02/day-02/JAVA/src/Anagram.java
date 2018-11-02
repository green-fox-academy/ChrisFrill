import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a string: ");
        String firstWord = scanner.next();
        System.out.println("Please provide another string: ");
        String secondWord = scanner.next();
        System.out.println("Is it an anagram? " + anagram(firstWord,secondWord));

    }

    public static boolean anagram(String firstWord, String secondWord) {
        String firstTemp = firstWord.replace(" ", "");
        String secondTemp = secondWord.replace(" ", "");;
        for (int i = 0; i < secondTemp.length(); i++) {
            if (firstTemp.contains(Character.toString(secondTemp.charAt(i)))){
                firstTemp = firstTemp.replaceFirst(Character.toString((secondTemp.charAt(i))), "");
            }else {
                return false;
            }
        }
        return true;
    }

}
