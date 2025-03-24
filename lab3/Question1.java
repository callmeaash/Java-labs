import java.util.Scanner;

public class Question1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num: ");
		int n = sc.nextInt();
		if (n % 2 == 0)	System.out.println("Even Number");
		else System.out.println("Odd number");
		sc.close();
	}
}