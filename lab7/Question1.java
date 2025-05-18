import java.util.Scanner;

public class Question1 {

    static int fact(int n){
        if (n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

    static int fibo(int n){
        if(n == 1) return 1;
        else if (n == 0) return 0;
        return fibo(n-1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        System.out.println("Factorial: " + fact(n));
        System.out.println(n + "th Fibonacci Term: " + fibo(n));
        sc.close();
    }
}
