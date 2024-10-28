package JavaPractice;

import java.util.Scanner;

public class Largest_Among_Three {

	public static void main(String[] args) {
		
		//Create an object for using scanner 
		Scanner scanner = new Scanner(System.in);
		
		//Get the three numbers from user
		System.out.println("Enter the first number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter the third number: ");
		int num3 = scanner.nextInt();
		
		 // Find out the largest number
		//Assume the first number is the largest
		int largest = num1;
		
		// Update largest if num2 is greater
		if(num2>largest) {
			largest = num2;
			
		}
		// Update largest if num3 is greater
		if(num3>largest) {
			largest = num3;
		}
		//Print the largest number
		System.out.println("The largest number is: "+largest);
		
		scanner.close();		

	}
}
/*Output:
Enter the first number: 
23
Enter the second number: 
45
Enter the third number: 
78
The largest number is: 78
*/
