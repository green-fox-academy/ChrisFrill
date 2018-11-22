import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return 5;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        if (b > a && b > c) {
            return b;
        }
        return c;
    }

    double median(List<Integer> pool) {
        Collections.sort(pool);
        if (pool.size() % 2 == 0) {
            int med1 = pool.get((pool.size() / 2));
            int med2 = pool.get((pool.size() / 2) - 1);
            return (double) ((med1 + med2) / 2);
        }
        return pool.get((pool.size() / 2));
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        String teve = "";
        for (int i = 0; i < hungarian.length(); i++) {
            char c = hungarian.charAt(i);
            if (isVowel(c)) {
                teve = teve + c + "v" + c;
            } else {
                teve = teve + c;
            }
        }
        return teve;
    }
}