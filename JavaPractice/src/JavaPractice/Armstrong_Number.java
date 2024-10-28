package JavaPractice;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		//Create an object for using scanner
		Scanner scanner = new Scanner(System.in);
		
		//Get the number from the user
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		
		//if-else block
		if(isArmstrong(number)) {
			System.out.println("The given number is an Armstrong number.");
		}
		else {
			System.out.println("The given number is not an Armstrong number.");
		}
		scanner.close();
	}
	//Function for checking Armstrong number
	public static boolean isArmstrong(int num) {
		 int originalNumber = num;
	        int sum = 0;
	        int numberOfDigits = String.valueOf(num).length();
	        
	        while (num != 0) {
	            int digit = num % 10; // Get the last digit
	            sum += Math.pow(digit, numberOfDigits); // Raise to the power of number of digits and add to sum
	            num /= 10; // Remove the last digit
	        }
	        
	        return sum == originalNumber; // Check if the sum equals the original number
	    }
	}
/*Output:
Enter the number: 
153
The given number is an Armstrong number.
*/
