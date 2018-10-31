public class ArrayExample {
    public static void main(String[] args) {
        final int john = 2; // We cannot modify finalised variable.
        int jane = 3;
        int[] numbers = new int[10];
        System.out.println(numbers.toString());
        System.out.println(numbers);
        System.out.println(numbers[1]);
        numbers[9] = 12;
        System.out.println(numbers[9]);
        System.out.println(numbers.length);
        int[] copyOfNumbers = numbers; // Made a pointer to the star of numbers.
        numbers[numbers.length-1] = 100;
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[9]);
        System.out.println(copyOfNumbers[9]);
        int[][] matrixAsWell;
        int[][][][][][] mamamatrix;
        final boolean[] booleans = new boolean[2];
        booleans[0] = true;
    }

}
