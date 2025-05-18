class BankAccount{
    private int balance = 100;

    public synchronized void withdraw(String threadName, int amount){
        System.out.println(threadName + " is trying to withdraw $" + amount);
        if(balance >= amount){
            System.out.println(threadName + " is about to withdraw $" + amount);
            balance -= amount;
            System.out.println(threadName + " completed withdrawl. Remaining balance $" + balance);
        } else {
            System.out.println("Not enough balance for " + threadName + " Remaining balance $" + balance);
        }
    }
}

class WithdrawalTask extends Thread{
    private BankAccount Account;
    private int amount;

    public WithdrawalTask(BankAccount Account, int amount, String threadName){
        super(threadName);
        this.Account = Account;
        this.amount = amount;
    }

    public void run(){
        Account.withdraw(Thread.currentThread().getName(), amount);
    }
}


public class Question6 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        WithdrawalTask task1 = new WithdrawalTask(account, 25, "User-1");
        WithdrawalTask task2 = new WithdrawalTask(account, 50, "User-2");
        task1.start();
        task2.start();
    }
}
