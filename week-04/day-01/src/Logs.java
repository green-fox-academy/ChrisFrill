import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    // \\s+
    public static void main(String[] args) {
        System.out.println(readFile("log.txt"));
        System.out.println(Arrays.toString(uniqIP(readFile("log.txt"))));
        System.out.println(getPostRatio(readFile("log.txt")));
    }

    public static List<String> readFile(String readThis) {
        List<String> fileRead = new ArrayList<>();
        Path filePath = Paths.get(readThis);
        try {
            fileRead = Files.readAllLines(filePath);
        } catch (Exception e) {
            System.out.println("Unable to read the file.");
        }
        return fileRead;
    }

    public static String[] uniqIP(List<String> splitThis) {
        String[] uniqIP = new String[splitThis.size()];

        for (String line : splitThis) {
            uniqIP[splitThis.indexOf(line)] = line.substring(27, 38);
        }
        return uniqIP;
    }

    public static double getPostRatio(List<String> splitThis) {
        double get = 0;
        double post = 0;

        for (String line : splitThis) {
            line.contains("GET");
            if (line.contains("GET")) {
                get++;
            } else {
                post++;
            }
        }
        return get / post;
    }

}
