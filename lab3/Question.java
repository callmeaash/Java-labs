import java.util.Scanner;

public class Question5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print("Enter the operator: ");
		char op = sc.next().CharAt(0);
		
		switch(op){
			case '+':
				System.out.println("Sum: " + (a+b));
				break;
        }
		sc.close();
	}
}