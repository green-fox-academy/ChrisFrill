import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

    public static void main(String[] args) {
        Path filePath = Paths.get("my-file.txt");
        List<String> content = new ArrayList<>();
        content.add("Krisztián Fodor");
        try {
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }

}
