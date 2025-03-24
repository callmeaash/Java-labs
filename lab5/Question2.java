import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int largest, smallest;
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Num%d: ", i+1);
            arr[i] = sc.nextInt();
        }
        largest = smallest = arr[0];
        for (int i : arr) {
            if (largest < i) largest = i;
            if (smallest > i) smallest = i;
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
        sc.close();
    }
}
