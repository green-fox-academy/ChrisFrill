public class SubStr {
    //  Create a function that takes two strings as a parameter
    //  Returns the starting index where the second one is starting in the first one
    //  Returns `-1` if the second string is not in the first one

    //  Example:
    //  System.out.println(subStr("this is what I'm searching in", "searching"));
    //  should print: `17`
    //  System.out.println(subStr("this is what I'm searching in", "not"));
    //  should print: `-1`

    public static void main(String[] args) {
        String searchIn = "The method will search in this string.";
        String findThis = "in";

        subStr(searchIn, findThis);
    }

    public static int subStr(String searchIn, String findThis) {
        int index = searchIn.indexOf(findThis);
        while (index >= 0) {
            System.out.println(index);
            index = searchIn.indexOf(findThis, index + 1);
        }
        return -1;
    }
}
