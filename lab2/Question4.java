import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for English: ");
        int subject1 = sc.nextInt();

        System.out.print("Enter marks for Nepali: ");
        int subject2 = sc.nextInt();

        System.out.print("Enter marks for Science: ");
        int subject3 = sc.nextInt();

        System.out.print("Enter marks for Math: ");
        int subject4 = sc.nextInt();

        System.out.print("Enter marks for Computer: ");
        int subject5 = sc.nextInt();

        int total = subject1 + subject2 + subject3 + subject4 + subject5;
        double average = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        
        sc.close();
    }
}
