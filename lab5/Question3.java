import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Num%d: ", i+1);
            arr[i] = sc.nextInt();
        }
        int temp;
        boolean swap;
        for (int i = 0; i < n-1; i++) {
            swap = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
        for (int i : arr) {
            System.out.printf("%d\t", i);
        }
        sc.close();
    }
}
