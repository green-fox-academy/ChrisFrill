import java.nio.file.*;

public class CopyFile {

    public static void main(String[] args) {
        copyFile("write-multiple-lines.txt", "copied-multiple-lines.txt");
        System.out.println(copyFile("write-multiple-lines.txt", "copied-multiple-lines.txt"));
    }

    public static Boolean copyFile(String copyThis, String pasteToThis) {
        Path copyFilePath = Paths.get(copyThis);
        Path pasteFilePath = Paths.get(pasteToThis);
        try {
            Files.copy(copyFilePath, pasteFilePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileAlreadyExistsException e) {
            return true;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
