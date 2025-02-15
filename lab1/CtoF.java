public class CtoF {
    
    public static void main(String[] args) {
        double C = Double.parseDouble(args[0]);
        double F = (1.8 * C) + 32;
        System.out.printf("Fahrenheit: %.2f%n", F);
    }
}
