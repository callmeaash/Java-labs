class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Question2 {
    public static void main(String[] args) {
        System.out.println("----- Single Level Inheritance -----");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\n----- Multilevel Inheritance -----");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println("\n----- Hierarchical Inheritance -----");
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
