import java.util.HashMap;

public class CountLetters {
    public HashMap countLetters(String string) {
        HashMap<Character, Integer> countedLetters = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (!countedLetters.containsKey(string.charAt(i))) {
                countedLetters.put(string.charAt(i), 0);
            }
            countedLetters.put(string.charAt(i), countedLetters.get(string.charAt(i)) + 1);
        }
        return countedLetters;
    }
}
