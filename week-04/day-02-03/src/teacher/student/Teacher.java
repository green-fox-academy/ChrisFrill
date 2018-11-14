package teacher.student;

public class Teacher {
    String name;

    public void teach(Student student) {
        student.learn();
    }

    public void anwer() {
        System.out.println("Teacher is answering.");

    }
}
