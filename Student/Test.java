package Student;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.toString());
        s1.setName("Mike");
        System.out.println(s1.toString());
        s1.setClasses("Java");
        System.out.println(s1.toString());
    }
}
