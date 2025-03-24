import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Num%d: ", i+1);
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum of Array Elements: "+ sum);
        sc.close();
    }
}