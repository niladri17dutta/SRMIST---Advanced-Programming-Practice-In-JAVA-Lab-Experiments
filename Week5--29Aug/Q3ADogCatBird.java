// Base class: Animal
abstract class Animal {
    String name;
    String sound;
    int numLegs;

    // Constructor
    public Animal(String name, String sound, int numLegs) {
        this.name = name;
        this.sound = sound;
        this.numLegs = numLegs;
    }

    // Method to make sound
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    // Method to walk
    public void walk() {
        System.out.println(name + " walks on " + numLegs + " legs.");
    }
}

// Derived class: Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name, "barks", 4);
    }
}

// Derived class: Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name, "meows", 4);
    }
}

// Derived class: Bird
class Bird extends Animal {
    public Bird(String name) {
        super(name, "chirps", 2);
    }

    // Additional method for Bird to fly
    public void fly() {
        System.out.println(name + " flies with " + numLegs + " legs.");
    }
}

// Main class to test the functionality
public class Q3ADogCatBird {
    public static void main(String[] args) {
        Dog dog = new Dog("Rover");
        Cat cat = new Cat("Whiskers");
        Bird bird = new Bird("Tweety");

        dog.makeSound();
        dog.walk();

        cat.makeSound();
        cat.walk();

        bird.makeSound();
        bird.walk();
        bird.fly(); // Specific behavior for Bird
    }
}