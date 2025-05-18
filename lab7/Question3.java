class Fruit {
    String name, taste, size;

    Fruit() {}

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " is " + size + " and tastes " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "sweet", "small");
    }

    @Override
    void eat() {
        System.out.println("Apple tastes sweet.");
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "sweet and sour", "medium");
    }

    @Override
    void eat() {
        System.out.println("Orange tastes sweet and sour.");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Fruit mango = new Fruit("Mango", "Juicy", "medium");
        mango.eat();
        Fruit apple = new Apple();
        apple.eat();
        Fruit orange = new Orange();
        orange.eat();
    }
}
