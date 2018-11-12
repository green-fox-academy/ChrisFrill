import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        System.out.println(reverseLine("reversed-lines.txt"));
    }

    public static List<String> reverseLine(String location) {
        Path filePath = Paths.get(location);
        List<String> fileRead = new ArrayList<>();
        try {
            fileRead = Files.readAllLines(filePath);
            for (int i = 0; i < fileRead.size(); i++){
                StringBuilder reversedLine = new StringBuilder(fileRead.get(i));
                reversedLine.reverse();
                fileRead.set(i, reversedLine.toString());
            }
        } catch (Exception e){
            System.out.println("Unable to read file.");
        }
        return fileRead;
    }
}