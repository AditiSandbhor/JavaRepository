package JavaPractice;

public class AutoboxingExample {

	public static void main(String[] args) {
		  
        // Autoboxing: Converting primitive types to wrapper objects automatically
        int primitiveInt = 100;  // Primitive data type
        Integer wrapperInt = primitiveInt;  // Autoboxing from int to Integer

        double primitiveDouble = 10.5;  // Primitive data type
        Double wrapperDouble = primitiveDouble;  // Autoboxing from double to Double

        boolean primitiveBoolean = true;  // Primitive data type
        Boolean wrapperBoolean = primitiveBoolean;  // Autoboxing from boolean to Boolean
        
        // Displaying the values
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Autoboxed Integer: " + wrapperInt);
        
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Autoboxed Double: " + wrapperDouble);
        
        System.out.println("Primitive boolean: " + primitiveBoolean);
        System.out.println("Autoboxed Boolean: " + wrapperBoolean);
        
        // Using the autoboxed values in an ArrayList
        // We can directly store primitive types in collection classes like ArrayList.
        // These collections automatically convert primitives to their wrapper classes.
        
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(primitiveInt);  // Autoboxing happens automatically here
        list.add(200);  // This also works due to autoboxing
        
        System.out.println("ArrayList content: " + list);

	}

}
/*Output: Primitive int: 100
Autoboxed Integer: 100
Primitive double: 10.5
Autoboxed Double: 10.5
Primitive boolean: true
Autoboxed Boolean: true
ArrayList content: [100, 200]
*/
