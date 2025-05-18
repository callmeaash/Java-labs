abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

public class Question6 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.sleep();

        cat.makeSound();
        cat.sleep();
    }
}
