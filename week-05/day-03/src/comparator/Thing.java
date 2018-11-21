package comparator;

import java.util.Comparator;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing>, Printable {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    public int compareTo(Thing o2) {
        int bool1 = this.completed ? 1 : 0;
        int bool2 = o2.completed ? 1 : 0;
        int comp = bool2 - bool1;

        if (comp != 0) {
            return comp;
        }

        String thingName1 = this.name;
        String thingName2 = o2.name;
        return thingName1.compareTo(thingName2);
    }

    @Override
    public void printAllFields() {
        System.out.println(this.name + " " + this.completed);

    }
}