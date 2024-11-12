package JavaPractice;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		//Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Store the original number for comparison
        int originalNum = num;
        
        // Variable to store the reversed number
        int reversedNum = 0;
        
        // Reversing the number
        while (num != 0) {
            int remainder = num % 10;  // Get the last digit of the number
            reversedNum = reversedNum * 10 + remainder;  // Append it to the reversed number
            num /= 10;  // Remove the last digit
        }
        
        // Check if the original number and reversed number are the same
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is not a Palindrome.");
        }
        
        // Close the scanner
        scanner.close();

	}
}
/* Output: Enter a number: 12321
12321 is a Palindrome.
*/
