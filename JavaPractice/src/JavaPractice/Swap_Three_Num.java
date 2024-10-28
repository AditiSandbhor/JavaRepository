package JavaPractice;

public class Swap_Three_Num {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c = 10;
        
        //Before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c);

        //Swap using arithmetic operations
        a = a + b + c; 
        b = a - (b + c); 
        c = a - (b + c); 
        a = a - (b + c);
        
        //After swapping
        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
    }
}
/*Before swapping: a = 6, b = 8, c = 10
After swapping: a = 10, b = 6, c = 8*/
