package bunnies;

public class BunnyTwo {
    public static void main(String[] args) {
        System.out.println(countEars(10));
    }

    public static int countEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            if (bunnies % 2 == 0) {
                return 3 + countEars(bunnies - 1);
            } else {
                return 2 + countEars(bunnies - 1);
            }
        }
    }
}
