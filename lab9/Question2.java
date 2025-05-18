import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {
        String fileName = "question2.txt";
        try (FileWriter fw = new FileWriter(fileName)){
            fw.write("First Line \nSecond Line\n");
        } catch(IOException e){
            System.out.println(e.getStackTrace());
        }
        System.out.println("Written Successfully...");
        try (FileReader fr = new FileReader(fileName)){
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
