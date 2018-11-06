import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStrList {
    public static void main(String[] args) {
        //  Create a function that takes a string and a list of string as a parameter
        //  Returns the index of the string in the list where the first string is part of
        //  Only need to find the first occurence and return the index of that
        //  Returns `-1` if the string is not part any of the strings in the list


        //  Example
        String[] searchArr = new String[]{"this", "is", "what", "I'm", "searching"};
        System.out.println(subStrList("ching", searchArr));
        //  should print: `4`
        System.out.println(subStrList("not", searchArr));
        //  should print: `-1`
    }

    public static int subStrList(String findThis, String[] searchInThis) {

        String searchList = Arrays.toString(searchInThis);
        int returnIndex = 0;
        if (searchList.contains(findThis)) {
            for (int i = 0; i < searchInThis.length; i++) {
                String temp = searchInThis[i];
                if (temp.contains(findThis)) {
                    System.out.println(i);
                    returnIndex = i;
                    break;
                }
            }
        } else {
            return -1;
        }
        return returnIndex;
    }
}