package Student;

public class Student {
    private String name;
    private String classes;
    Student() {
        name = "John";
        classes ="C02";
    }
    Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", classes=" + classes + "]";
    }
}
