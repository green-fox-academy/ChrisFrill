import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {

    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        System.out.println(getNumbers("lottery.txt"));
        System.out.println(countNumbersFrequency("lottery.txt"));
        System.out.println(mostCommonNumbers("lottery.txt"));


    }

    public static List<String> getNumbers(String location) {
        Path filePath = Paths.get(location);
        List<String> fileRead;
        List<String> numbers = new ArrayList<>();
        try {
            fileRead = Files.readAllLines(filePath);
            for (String line : fileRead) {
                line.split(";");
                numbers.addAll(Arrays.asList(line.split(";")).subList(11, 16));
            }
        } catch (IOException e) {
            System.out.println("Unable to read file.");
        }
        return numbers;
    }

    public static HashMap<String, Integer> countNumbersFrequency(String location) {
        List<String> numbers = getNumbers(location);
        HashMap<String, Integer> numbersFrequency = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            String key = numbers.get(i);
            if (numbersFrequency.containsKey(key)) {
                int value = numbersFrequency.get(key);
                value++;
                numbersFrequency.put(key, value);
            } else {
                numbersFrequency.put(key, 1);
            }
        }
        return numbersFrequency;
    }

    public static List<String> mostCommonNumbers(String location) {
        HashMap<String, Integer> numbers = countNumbersFrequency(location);
        List<Integer> sorted = new ArrayList<>(numbers.values());
        sorted.sort(Comparator.reverseOrder());
        List<String> mostCommon = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (HashMap.Entry<String, Integer> entry : numbers.entrySet()) {
                if (entry.getValue().equals(sorted.get(i)) && !(mostCommon.contains(entry.getKey()))) {
                    mostCommon.add(entry.getKey());
                }
            }

        }
        return mostCommon;
    }
}