import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {

    public static void main(String[] args) {
        writeMultipleLines("write-multiple-lines.txt", "Krisz", 8);
    }

    public static void writeMultipleLines(String location, String word, int lineNum) {
        Path filePath = Paths.get(location);
        List<String> content = new ArrayList<>();
        for (int i = 0; i < lineNum; i++) {
            content.add(word);
        }
        try {
            Files.write(filePath, content);
        } catch (Exception e) {
        }
    }

}
