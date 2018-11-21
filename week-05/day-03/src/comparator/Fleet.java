package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.03.29..
 */
public class Fleet {
    private List<Thing> things;

    public Fleet() {
        things = new ArrayList<>();
    }

    public void add(Thing thing) { things.add(thing);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < things.size(); i++) {
            result += (i + 1) + ". " + things.get(i) + "\n";
        }
        return result;
    }

    public List<Thing> getThings() {
        return things;
    }
}