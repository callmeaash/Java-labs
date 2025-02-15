import java.util.Scanner;

public class Question4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num: ");
		int n = sc.nextInt();
		if ( n % 2 == 0) {
			if (n % 3 == 0)
				System.out.println("Even and Divisible by 3");
			else
				System.out.println("Even and not Divisible by 3");
		}
		else {
			if ( n % 3 == 0)
				System.out.println("Odd and Divisible by 3");
			else
				System.out.println("Odd and not Divisible by 3");
		}
		sc.close();
	}
}