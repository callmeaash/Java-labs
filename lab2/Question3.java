import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three nums: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
        int smallest = (a <= b && a <= c) ? a : (b <= a && b <= c) ? b : c;
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        sc.close();
    }
}
 