import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

        unique(new int[] {0, 1, 11, 34, 11, 52, 61, 1, 34, 0,});
    }

    public static int[] unique(int[] params) {
        int[] uniq = new int[params.length];
        int n = 0;
        boolean notSame = true;
        System.out.println(Arrays.toString(uniq));
        for (int i= 0; i < params.length; i++){

        }


        for (int i = 0; i < params.length; i++) {
            for (int j = 0; j < params.length; j++) {
                 if (params[i] == uniq[j]) {
                    notSame = false;
                    break;
                }
                notSame = true;
            }

            if (notSame) {
                uniq[n] = params[i];
                System.out.print(uniq[n] + " ");
                n++;
            }

        }
        return uniq;
    }
}
