interface Worker {
    void performDuties();  // Method to be implemented by any class that works as a worker
}

// Person class representing common details of a person
class Person {
    String name;   // Name of the person
    int id;        // Unique ID for the person

    // Constructor to initialize name and id
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Chef class inheriting from Person and implementing Worker interface
class Chef extends Person implements Worker {
    // Constructor to initialize name and id for Chef
    Chef(String name, int id) {
        super(name, id);  // Call the constructor of the Person class
    }

    // Implement the performDuties method from Worker interface
    public void performDuties() {
        System.out.println(name + " With Id " + id + " is cooking meals.");  // Chef-specific duty
    }
}

// Waiter class inheriting from Person and implementing Worker interface
class Waiter extends Person implements Worker {
    // Constructor to initialize name and id for Waiter
    Waiter(String name, int id) {
        super(name, id);  // Call the constructor of the Person class
    }

    // Implement the performDuties method from Worker interface
    public void performDuties() {
        System.out.println(name + " With Id " + id + " is serving food to customers.");  // Waiter-specific duty
    }
}

// Main class: RestaurantSystem - Entry point of the program
public class RestaurantSystem {
    public static void main(String[] args) {
        // Create a Chef object
        Chef chef = new Chef("Ankit", 101);
        // Create a Waiter object
        Waiter waiter = new Waiter("Sakshi", 102);

        // Chef performs their duty
        chef.performDuties();
        // Waiter performs their duty
        waiter.performDuties();
    }
}