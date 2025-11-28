
public class Person {

    String name;
    int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
