import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Question3try {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName = "test.txt";
        FileWriter fw = new FileWriter(fileName);
        fw.write("Roll, Name, Address, Phone Number\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student record: ");
            fw.write(sc.nextInt() + ", " + sc.next() + ", " + sc.next() + ", " + sc.next() + "\n");
        }
        fw.close();
        FileReader fr = new FileReader(fileName)
        
        System.out.println(bfr.readLine());
        String line;
        while ((line = bfr.readLine()) != null) {
            System.out.println(line);
        }
        sc.close();
    }
}   
