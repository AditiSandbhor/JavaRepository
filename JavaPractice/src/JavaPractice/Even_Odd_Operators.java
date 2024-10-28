package JavaPractice;

import java.util.Scanner;

public class Even_Odd_Operators {
	public static void main(String[] args) {
		//Create an object for using scanner 
		Scanner scanner = new Scanner(System.in);
		
		//Get input from user
		System.out.println("Enter the number:");
		int number = scanner.nextInt();
		
		//Using conditional operator to determine even or odd
		String result = (number % 2 == 0) ? "Even":"Odd";
		
		//Print the result
		System.out.println("The number is "+result);
		
		
		scanner.close();
	}

}
/*Enter the number:
24
The number is Even
Enter the number:
33
The number is Odd
*/
