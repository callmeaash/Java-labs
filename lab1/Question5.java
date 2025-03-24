
public class Question5 {
    
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);

        int t = Integer.parseInt(args[1]);
        double r = Double.parseDouble(args[2]);


        double SI = (p * t * r) / 100.0;
        System.out.printf("Simple Interest: %.2f%n", SI);
    }
}
