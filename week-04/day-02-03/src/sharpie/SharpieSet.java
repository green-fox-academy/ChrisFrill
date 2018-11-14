package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    int usable;
    ArrayList<Sharpie> sharpies;

    public SharpieSet() {
        sharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        sharpies.add(sharpie);
    }

    public int countUsable() {
        for (Sharpie sharpie : sharpies) {
            if (sharpie.inkAmount > 0) {
                usable++;
            }
        }
        return usable;
    }

    public void removeTrash() {
        for (Sharpie sharpie : sharpies) {
            if (sharpie.inkAmount <= 0) {
                sharpies.remove(sharpie);
            }

        }
    }

    @Override
    public String toString() {
        return "SharpieSet{" +
                "usable=" + usable +
                ", sharpies=" + sharpies +
                '}';
    }
}
