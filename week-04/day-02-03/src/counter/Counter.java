package counter;

public class Counter {
    int num;
    int initialNum;

    public Counter() {
        num = 0;
        initialNum = num;
    }

    public Counter(int num) {
        this.num = num;
        initialNum = num;

    }

    public void add(int number) {
        this.num += number;
    }

    public void add() {
        this.num++;
    }

    public int get() {
        return num;
    }

    public void reset() {
        num = initialNum;
    }

}
