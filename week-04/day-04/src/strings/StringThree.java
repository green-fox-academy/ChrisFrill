package strings;

public class StringThree {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    public static void main(String[] args) {
        System.out.println(separateByStar("xxxaxaxaxa"));
    }

    public static String separateByStar(String string) {
        if (string.length() == 1) {
            return string;
        } else {
            return separateByStar(string.substring(0, string.length() - 1)) + "*" + string.charAt(string.length() - 1);
        }
    }
}
