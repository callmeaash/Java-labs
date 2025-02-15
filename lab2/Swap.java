import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swap without Using third Variable");
        System.out.println("a: " + a + ", b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap without without using third Variable");
        System.out.println("a: " + a + ", b: " + b);
        scanner.close();
    }
}
