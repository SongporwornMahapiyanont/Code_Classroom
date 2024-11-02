public class Objecct {
    public static void main(String[] args) {
        Object obj1 = "Hello";   // String is a subclass of Object
        Object obj2 = 123;       // Autoboxed Integer is a subclass of Object
        
        // Using Object methods
        System.out.println(obj1.toString());   // Prints: Hello
        System.out.println(obj2.hashCode());   // Prints: Hash code for Integer object
            
        // Casting back to specific types
        String str = (String) obj1;
        System.out.println(str.toUpperCase()); // Prints: HELLO
    }
}
