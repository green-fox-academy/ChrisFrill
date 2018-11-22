import java.util.ArrayList;

public class Sum {
    private ArrayList<Integer> numbers;

    public Sum() {
        numbers = new ArrayList<>();
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public void add(int num) {
        numbers.add(num);
    }
}
