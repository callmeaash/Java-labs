class Shape {
    void area() {
        System.out.println("Calculating area of a shape...");
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class Question4 {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(5, 10);
        Shape shape2 = new Rectangle(4, 6);

        shape1.area();
        shape2.area();
    }
}
