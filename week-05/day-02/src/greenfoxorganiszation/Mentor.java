package greenfoxorganiszation;

public class Mentor extends Person {
    private String level;

    public Mentor() {
        super();
        setLevel("Intermediate");
    }

    public Mentor(String name, int age, String gender, String level) {
        setName(name);
        setAge(age);
        setGender(gender);
        setLevel(level);
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " a "
                + getAge() + " year old " + getGender() + " "
                + getLevel() + " mentor.");
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
