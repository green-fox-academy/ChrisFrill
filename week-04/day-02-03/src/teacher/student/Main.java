package teacher.student;

public class Main {

    public static void main(String[] args) {
        Student krisz = new Student();
        Teacher barna = new Teacher();

        krisz.question(barna);
        barna.teach(krisz);
    }

}
