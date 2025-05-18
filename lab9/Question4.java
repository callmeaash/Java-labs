public class Question4 {
    public static void main(String[] args) {
        
        int n = 10;
        double d = 20.5;
        char c = 'A';
        
        Integer iObj = n;
        Double dObj = d;
        Character cObj = c;
        
        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + n + " => Wrapper Integer: " + iObj);
        System.out.println("Primitive double: " + d + " => Wrapper Double: " + dObj);
        System.out.println("Primitive char: " + c + " => Wrapper Character: " + cObj);
        
        Integer iObj2 = new Integer(30);
        Double dObj2 = new Double(40.5);
        Character cObj2 = new Character('B');
        
        int n2 = iObj2;
        double d2 = dObj2;
        char c2 = cObj2;
        
        System.out.println("\nUnboxing:");
        System.out.println("Wrapper Integer: " + iObj2 + " => Primitive int: " + n2);
        System.out.println("Wrapper Double: " + dObj2 + " => Primitive double: " + d2);
        System.out.println("Wrapper Character: " + cObj2 + " => Primitive char: " + c2);
    }
}
