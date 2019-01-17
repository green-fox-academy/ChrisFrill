package greenfoxorganiszation;

public class Main {
    public static void main(String[] args) {
        Student john = new Student("John", 20, "male", "BME");
        john.introduce();

        try {
            Student johnTheClone = john.clone();
            johnTheClone.introduce();
        } catch (CloneNotSupportedException cns) {
            System.out.println("Couldn't clone.");
        }
    }
}
