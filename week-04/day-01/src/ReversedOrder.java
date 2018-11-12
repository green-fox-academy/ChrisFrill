import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        System.out.println(reverseOrder("reversed-order.txt"));
    }

    public static List<String> reverseOrder(String location) {
        Path filePath = Paths.get(location);
        List<String> fileRead = new ArrayList<>();
        List<String> fileReversed = new ArrayList<>();
        try {
            fileRead = Files.readAllLines(filePath);
            for (int i = fileRead.size()-1; i > -1; i--) {
                fileReversed.add(fileRead.get(i));
            }
        } catch (IOException e) {
            System.out.println("Unable to read file.");
        }
        return fileReversed;
    }
}