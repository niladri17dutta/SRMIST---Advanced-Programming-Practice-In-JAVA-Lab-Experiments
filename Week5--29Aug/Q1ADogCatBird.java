// Abstract class Animal
abstract class Animal {
    // Abstract method makeSound
    abstract void makeSound();
    
    // Abstract method eat
    abstract void eat();
}

// Subclass Dog that extends Animal
class Dog extends Animal {
    // Implementation of makeSound for Dog
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
    
    // Implementation of eat for Dog
    @Override
    void eat() {
        System.out.println("Dog is eating dog food.");
    }
}

// Subclass Cat that extends Animal
class Cat extends Animal {
    // Implementation of makeSound for Cat
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
    
    // Implementation of eat for Cat
    @Override
    void eat() {
        System.out.println("Cat is eating cat food.");
    }
}

// Subclass Bird that extends Animal
class Bird extends Animal {
    // Implementation of makeSound for Bird
    @Override
    void makeSound() {
        System.out.println("Bird chirps: Chirp Chirp!");
    }
    
    // Implementation of eat for Bird
    @Override
    void eat() {
        System.out.println("Bird is eating seeds.");
    }
}

// Main class to test the implementation
public class Q1ADogCatBird {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();
        
        dog.makeSound();
        dog.eat();
        
        cat.makeSound();
        cat.eat();
        
        bird.makeSound();
        bird.eat();
    }
}
