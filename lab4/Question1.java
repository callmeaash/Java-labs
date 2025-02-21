import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num: ");
        int n = sc.nextInt();
        int rem, sum = 0;
        while (n != 0) {
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
