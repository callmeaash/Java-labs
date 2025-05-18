class MyRunnable implements Runnable{
    private String threadName;

    public MyRunnable(String threadName){
        this.threadName = threadName;
    }

    public void run(){
        for (int i = 1; i <= 3; i++){
            System.out.println(threadName + " count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught: " + e.getMessage());
            }
        }
        System.out.println(threadName + " finished execution.....");
    }
}

class MyThread extends Thread{
    private String threadName;

    public MyThread(String threadName){
        this.threadName = threadName;
    }

    public void run(){
        for (int i = 1; i <= 3; i++){
            System.out.println(threadName + " count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught: " + e.getMessage());
            }
        }
        System.out.println(threadName + " finished execution.....");
    }
}


public class Question4 {

    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable("Thread-1");
        Thread thread1 = new Thread(runnable1);

        MyThread thread2 = new MyThread("Thread-2");
        thread1.start();
        thread2.start();
    }
}