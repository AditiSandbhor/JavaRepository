package JavaPractice;

public class UnboxingExample {
    public static void main(String[] args) {
        
        // Autoboxing: Wrapper class objects (Boxed) containing primitive values
        Integer wrapperInt = new Integer(100);  // Wrapper object for int
        Double wrapperDouble = new Double(10.5);  // Wrapper object for double
        Boolean wrapperBoolean = Boolean.TRUE;  // Wrapper object for boolean
        
        // Unboxing: Converting wrapper class objects to their corresponding primitive types automatically
        int primitiveInt = wrapperInt;  // Unboxing from Integer to int
        double primitiveDouble = wrapperDouble;  // Unboxing from Double to double
        boolean primitiveBoolean = wrapperBoolean;  // Unboxing from Boolean to boolean
        
        // Displaying the values after unboxing
        System.out.println("Unboxed int: " + primitiveInt);
        System.out.println("Unboxed double: " + primitiveDouble);
        System.out.println("Unboxed boolean: " + primitiveBoolean);
        
        // Using unboxed values in arithmetic operations
        int result = primitiveInt + 50;  // Unboxed primitive value used in calculation
        System.out.println("Result after arithmetic operation: " + result);
        
        // Unboxing in collections (ArrayList)
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(wrapperInt);  // Autoboxing when adding
        int listValue = list.get(0);  // Unboxing when retrieving
        System.out.println("Unboxed value from ArrayList: " + listValue);
    }
}
/*Output:
Unboxed int: 100
Unboxed double: 10.5
Unboxed boolean: true
Result after arithmetic operation: 150
Unboxed value from ArrayList: 100
*/
