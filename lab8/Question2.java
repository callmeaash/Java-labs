import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message){
        super(message);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw Amount: ");
            double withdraw = sc.nextDouble();

            balance -= withdraw;
            if(balance < 0){
                throw new InsufficientBalanceException("Withdrawal Failed: Insufficient Balance");
            } else {
                System.out.println("Remaining Balance: " + balance);
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    
    sc.close();
    }
}
