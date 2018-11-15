package strings;

public class StringOne {
    public static void main(String[] args) {
        System.out.println(changeXToLowerCase("xxxaxaxaxa"));
    }

    public static String changeXToLowerCase(String string) {
        if (string.length() == 0) {
            return "";
        } else {
            if (string.subSequence(string.length() - 1, string.length()).equals('x')) {
                return changeXToLowerCase(string.substring(0, string.length() - 1)) + 'y';
            } else {
                return changeXToLowerCase(string.substring(0, string.length() - 1)) + string.charAt(string.length() - 1);
            }
        }
    }
}
