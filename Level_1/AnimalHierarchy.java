// Base class representing a generic animal
class Animal {
    protected String name; // Name of the animal
    protected int age;     // Age of the animal

    // Constructor to initialize animal details
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden for specific animal sounds
    public void makeSound() {}
}

// Subclass representing a Dog
class Dog extends Animal {

    // Constructor to initialize dog details
    public Dog(String name, int age) {
        super(name, age); // Call the parent class constructor
    }

    // Prints details of the dog
    public void printDogDetails() {
        System.out.println("Dog name is: " + name + "\nDog age is: " + age);
    }

    // Overrides makeSound to provide a dog's sound
    public void makeSound() {
        System.out.println("Dog makes sound: Bhav");
    }
}

// Subclass representing a Cat
class Cat extends Animal {

    // Constructor to initialize cat details
    public Cat(String name, int age) {
        super(name, age); // Call the parent class constructor
    }

    // Prints details of the cat
    public void printCatDetails() {
        System.out.println("Cat name is: " + name + "\nCat age is: " + age);
    }

    // Overrides makeSound to provide a cat's sound
    @Override
    public void makeSound() {
        System.out.println("Cat makes sound: Meow");
    }
}

// Subclass representing a Bird
class Bird extends Animal {

    // Constructor to initialize bird details
    public Bird(String name, int age) {
        super(name, age); // Call the parent class constructor
    }

    // Prints details of the bird
    public void printBirdDetails() {
        System.out.println("Bird name is: " + name + "\nBird age is: " + age);
    }

    // Overrides makeSound to provide a bird's sound
    public void makeSound() {
        System.out.println("Bird makes sound: Chihu");
    }
}

// Main class to demonstrate the animal hierarchy
public class AnimalHierarchy {
    public static void main(String[] args) {

        // Create a Dog object and display its details and sound
        Dog dog = new Dog("xyz", 5);
        dog.printDogDetails();
        dog.makeSound();
        System.out.println();

        // Create a Cat object and display its details and sound
        Cat cat = new Cat("Pihu", 4);
        cat.printCatDetails();
        cat.makeSound();
        System.out.println();

        // Create a Bird object and display its details and sound
        Bird bird = new Bird("bird", 2);
        bird.printBirdDetails();
        bird.makeSound();
    }
}