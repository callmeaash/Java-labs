import java.util.Scanner;

class Student {
    String name = "Aashish Bogati";
    String address = "Machhapokhari";
    int roll = 2;

    public Student(){}

    public Student(String n, String a, int r){
        name = n;
        address = a;
        roll = r;
    }
}

public class myStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        System.out.println("Default Values: ");
        System.out.println("Name: " + student1.name);
        System.out.println("Address: " + student1.address);
        System.out.println("Roll: " + student1.roll);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Roll: ");
        int roll = sc.nextInt();

        Student student2 = new Student(name, address, roll);
        System.out.println("Name: " + student2.name);
        System.out.println("Address: " + student2.address);
        System.out.println("Roll: " + student2.roll);

        sc.close();
    }
}


