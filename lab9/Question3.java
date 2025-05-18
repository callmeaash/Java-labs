import java.io.*;
import java.util.Scanner;

class Student implements Serializable{
    int roll;
    String name, address, phone;

    public Student(int roll, String name, String address, String phone){
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void display(){
        System.out.println(roll + ", " + name + ", " + address + ", " + phone);
    }
}

public class Question3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String fileName = "question3.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Student Record: ");
            Student student = new Student(sc.nextInt(), sc.next(), sc.next(), sc.next());
            oos.writeObject(student);
        }
        System.out.println("File Written Successfully....");
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        System.out.println("Student with address Kirtipur: ");
        for(int i = 0; i < 3; i++){
            Student s = (Student) ois.readObject();
            if (s.address.equalsIgnoreCase("kirtipur")){
                s.display();
            }
        }
        ois.close();
    sc.close();
    }
}
