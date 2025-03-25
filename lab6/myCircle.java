import java.util.Scanner;

class Circle {
    private double radius;

    Circle(double r){
        radius = r;
    }

    double findArea(){
        return (3.14 * radius * radius);
    }
    double findCircumference(){
        return (2 * 3.14 * radius);
    }
    
}

public class myCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.printf("Area of Circle: %.2f%n", circle.findArea() );
        System.out.printf("Circumference of Circle: %.2f%n", circle.findCircumference() );
        sc.close();

    }
}
