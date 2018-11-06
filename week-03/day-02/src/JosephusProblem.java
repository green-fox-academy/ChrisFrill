import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        while (true) {
            JosephusProblem();
        }
    }

    public static int JosephusProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people are in the game? ");
        int peopleCount = scanner.nextInt();
        ArrayList<Integer> group = new ArrayList<>();

        for (int i = 0; i < peopleCount; i++) {
            group.add(i, i + 1);
        }

        while (group.size() != 1) {
            if (group.size() % 2 == 0) {
                for (int i = 0; i < group.size(); i++) {
                    group.remove(i + 1);
                }
            }

            if (group.size() % 2 != 0 && group.size() != 1) {
                for (int i = 0; i < group.size() - 1; i++) {
                    group.remove(i + 1);
                }
                group.remove(0);
            }
        }
        System.out.println(group);
        return group.get(0);
    }
}
