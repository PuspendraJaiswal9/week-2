public class Person {
    public String name;
    public int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person copy) {
        this.name = copy.name;
        this.age = copy.age;
    }
    public static void main(String[] args) {
        // Creating a person using the parameterized constructor
        Person person1 = new Person("John Doe", 30);
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);

        // Creating a person using the copy constructor
        Person person2 = new Person(person1);
        System.out.println("Person 2 (Copy of Person 1):");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
    }
}