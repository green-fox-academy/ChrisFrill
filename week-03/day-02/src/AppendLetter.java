import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    public static List<String> appendA(List<String> userInput){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        for (int i = 0; i < userInput.size(); i++){
            userInput.set(i, userInput.get(i).concat("a"));
        }
        return userInput;
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"