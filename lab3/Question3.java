import java.util.Scanner;

public class Question3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a > b && a < c) || (a < b && a > c))
			System.out.println(a + " is second Largest");

		else if ((b > a && b < c) || (b < a && b > c))
			System.out.println(b + " is second Largest");

		else
			System.out.println(c + " is second Largest");
		sc.close();
	}
}