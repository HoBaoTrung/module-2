package BTVN;

public class User {
    public String name, email;
    public int age, id;
    User(int id, String name,String email, int age) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "id: " + this.id + ", name: " + this.name + ", age: " + this.age + ", email: " + this.email;
    }
}
