import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i <= n; i++)
        {
            if (i != n && n % i == 0){
                System.out.println("Composite Number");
                isPrime = false;
                break;
            }

        }
        if (isPrime) System.out.println("Prime Number");
        sc.close();
    }
}
