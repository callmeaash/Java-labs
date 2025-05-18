public class Question1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmaticException caught: " + e.getMessage());
        }

        try {
            int[] a = {5, 10, 15};
            int value = a[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayOutOfBoundException caught: " + e.getMessage());
        }

        try {
            String s = "aashish";
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
