public class Question3 {
    public static void main(String[] args) {
        System.out.println("\n---Character Extraction---");
        String text = "Hello, World!";
        System.out.println("Original String: " + text);

        char ch = text.charAt(7);
        System.out.println("charAt(7): " + ch);

        char[] dest = new char[5];
        text.getChars(7, 12, dest, 0);
        System.out.print("getChars(7, 12): ");
        for (char c : dest) {
            System.out.print(c);
        }
        System.out.println();

        char[] charArray = text.toCharArray();
        System.out.print("toCharArray(): ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("\n--- String Modification ---");
        String sub = text.substring(7, 12);
        System.out.println("substring(7, 12): " + sub);

        String greeting = "Hi";
        String message = greeting.concat(", " + sub + "!");
        System.out.println("concat(): " + message);

        String replaced = text.replace("World", "Java");
        System.out.println("replace(): " + replaced);

        String str1 = "Apple";
        String str2 = "apple";

        
        System.out.println("\n--- String Comparison ---");
        System.out.println("Str1 = " + str1 + "\nStr2 = " + str2);
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
    }
}
