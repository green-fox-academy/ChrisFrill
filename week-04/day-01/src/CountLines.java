import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {
        System.out.println(countLines("my-file.txt"));
    }

    public static int countLines(String fileName) {
        int lineCount = 0;
        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                lineCount++;
            }
        } catch (Exception e) {
            return 0;
        }
        return lineCount;
    }
}
