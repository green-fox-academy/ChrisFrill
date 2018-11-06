import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indexes of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        int[] nums = {-5, 1, 2, 11, 3};
        Arrays.sort(nums);
        String[] a = Arrays.toString(nums).split("[\\[\\]]")[1].split(", ");
        System.out.println(Arrays.toString(a));

        //  Example:
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'

    }

    public static int[] subInt(int input, int[] list) {


        for (int i = 0; i < list.length; i++) {
            if (Arrays.asList(list[i]).contains(input)) {
                System.out.println(list[i]);
            }
        }
        return list;
    }


}