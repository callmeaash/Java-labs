import java.util.*;

public class Question5 {
    public static void main(String[] args) {

        System.out.println("Vector Class Example:");
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector: " + vector);
        System.out.println("Element at index 2: " + vector.get(2));
        
        System.out.println("\nStack Class Example:");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        
        System.out.println("\nHashtable Class Example:");
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("A", "Apple");
        hashtable.put("B", "Banana");
        hashtable.put("C", "Cherry");
        System.out.println("Hashtable: " + hashtable);
        System.out.println("Value for key 'B': " + hashtable.get("B"));
        
        System.out.println("\nRandom Class Example:");
        Random random = new Random();
        System.out.println("Random Integer: " + random.nextInt(100));
        System.out.println("Random Double: " + random.nextDouble());
        System.out.println("Random Boolean: " + random.nextBoolean());
    }
}
