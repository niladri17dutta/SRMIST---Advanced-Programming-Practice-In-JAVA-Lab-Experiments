// Abstract class Animal
abstract class Animal {
    // Abstract method makeSound
    abstract void makeSound();
}

// Subclass Mammal
class Mammal extends Animal {
    @Override
    void makeSound() {
        System.out.println("Mammal makes a sound: Woof Woof");
    }
}

// Subclass Bird
class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird makes a sound: Chirp Chirp");
    }
}

// Subclass Fish
class Fish extends Animal {
    @Override
    void makeSound() {
        System.out.println("Fish makes a sound: Blub Blub");
    }
}

// Main class to demonstrate polymorphism
public class Q2AAnimalHierarchy {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[3];
        
        // Initialize the array with different types of animals
        animals[0] = new Mammal();
        animals[1] = new Bird();
        animals[2] = new Fish();
        
        // Iterate through the array and call the makeSound() method for each animal
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
