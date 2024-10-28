package JavaPractice;

public class Swap_Two_Num {

	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		
		//Before swapping 
		System.out.println("Before swapping: a ="+a+",b ="+b);
		
		//Swap using arithmetic operators
		a = a+b;
		b = a-b;
		a = a-b;
		
		//After swapping
		System.out.println("After swapping: a ="+a+",b ="+b);

	}

}
/*Before swapping: a =10,b =7
After swapping: a =7,b =10*/
