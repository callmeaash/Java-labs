import java.util.Scanner;

public class Question5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print("Enter the operator: ");
		char op = sc.next().charAt(0);
		
		switch(op){
			case '+':
				System.out.println("Addition: " + (a+b));
				break;
			case '-':
				System.out.println("SUbtraction: " + (a-b));
				break;
			case '/':
				System.out.printf("Division: %.2f%n", ((float)a/b));
				break;
			case '%':
				System.out.println("Reminder: " + (a%b));
				break;
			case '*':
				System.out.println("Multiplication: " + (a*b));
				break;
			default:
				System.out.println("Invalid Operator");
		}
		sc.close();
	}
}