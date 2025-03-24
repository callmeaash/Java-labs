
public class Question3 {
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int breadth = Integer.parseInt(args[1]);

        int perimeter = 2 * (length + breadth);
        int area = length * breadth;

        System.out.println("Perimeter of Rectangle: "+ perimeter);
        System.out.println("Area of Rectangle: " + area);
    }
}
