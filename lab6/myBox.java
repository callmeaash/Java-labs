import java.util.Scanner;

class Box{
    private int length;
    private int breadth;
    private int height;

    public Box(int l, int b, int h){
        length= l;
        breadth = b;
        height = h;
    }

    public int getVolume(){
        return (length * breadth * height);
    }

    public int getSurfaceArea(){
        return (2 * (length*breadth + breadth*height + length*height));
    }
}

public class myBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Box Length: ");
        int length = sc.nextInt();
        System.out.print("Box Breadth: ");
        int breadth = sc.nextInt();
        System.out.print("Box Height: ");
        int height = sc.nextInt();

        Box box = new Box(length, breadth, height);
        System.out.println("Box Volume: " + box.getVolume());
        System.out.println("Box Surface Area: " + box.getSurfaceArea());
        sc.close();
    }
}
