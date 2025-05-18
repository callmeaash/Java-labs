import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Question1 {
    public static void main(String[] args) throws Exception {
        String sentence = "Java is a Object Oriented Programming Language...";
        String fileName = "question1.txt";

        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(sentence.getBytes());
        System.out.println("Written to file successfully...");
        fos.close();

        FileInputStream fin = new FileInputStream(fileName);
        int c, count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        while ((c = fin.read()) != -1) {
            for(int i = 0, len = vowels.length; i < len; i++){
                if (Character.toLowerCase((char) c) == vowels[i]){
                    count++;
                    break;
                }
            }
        }
        fin.close();
        System.out.println("Total Vowels: " + count);
    }
}
