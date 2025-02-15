// Arithmatic Operations
public class arithOper {
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum: "+ (a+b));
        System.out.println("Mul: "+ (a*b));
        System.out.println("Sub: "+ (a-b));
        System.out.printf("Div: %.2f%n", (a/(float)b));
    }
}
