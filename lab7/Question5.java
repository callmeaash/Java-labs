interface Addition {
    double add(double a, double b);
}

interface Subtraction {
    double subtract(double a, double b);
}

interface Multiplication {
    double multiply(double a, double b);
}

interface Division {
    double divide(double a, double b);
}

class Calculator implements Addition, Subtraction, Multiplication, Division {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 10.0;
        double num2 = 5.0;
        System.out.println("Num1 = " + num1 + "  Num2 = " + num2);
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
