class MyTask extends Thread{
    
    public MyTask(String taskName){
        this.setName(taskName);
    }

    public void run(){
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread ID: " + getId());
        System.out.println("Thread Priority: " + getPriority());
        System.out.println("Is Daemon: " + isDaemon());
        System.out.println("Is Alive : " + isAlive());

        for (int i = 1; i <= 2; i++) {
            System.out.println(getName() + " is running step " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }

        System.out.println(getName() + " finished.");
    }
}

public class Question5 {
    public static void main(String[] args) {
        MyTask task1 = new MyTask("Task-1");
        task1.setPriority(2);
        task1.setDaemon(false);
        task1.start();
        try {
            task1.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName() + "Thread finished..");
    }
}
