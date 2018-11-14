package teacher.student;

public class Student {
    String name;

    public void learn() {
        System.out.println("Student is learning.");
    }

    public void question(Teacher teacher) {
        teacher.anwer();
    }
}

