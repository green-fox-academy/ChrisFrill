import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {
        System.out.println(encodeLine("encoded-lines.txt"));
    }

    public static List<String> encodeLine(String location) {
        Path filePath = Paths.get(location);
        List<String> fileRead;
        List<String> fileEncoded = new ArrayList<>();
        try {
            fileRead = Files.readAllLines(filePath);
            for (String line : fileRead) {
                StringBuilder lineEncoded = new StringBuilder(line);
                for (int j = 0; j < line.length(); j++) {
                    char temp = lineEncoded.charAt(j);
                    int ascii = temp;
                    if (ascii > 32) {
                        lineEncoded.setCharAt(j, (char) (ascii - 1));
                    }
                }
                fileEncoded.add(lineEncoded.toString());
            }
        } catch (IOException e) {
            System.out.println("Unable to read file.");
        }
        return fileEncoded;
    }
}
