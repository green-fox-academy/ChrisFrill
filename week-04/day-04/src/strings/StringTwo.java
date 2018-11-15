package strings;

public class StringTwo {
    public static void main(String[] args) {
        System.out.println(removeX("ayxxxaxaxaxa"));
    }

    public static String removeX(String string) {
        if (string.length() == 0) {
            return "";
        } else {
            if (string.subSequence(string.length() - 1, string.length()).equals("x")) {
                return removeX(string.substring(0, string.length() - 1));
            } else {
                return removeX(string.substring(0, string.length() - 1)) + string.charAt(string.length() - 1);
            }
        }
    }
}
