package JavaPractice;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		//Create an object for using scanner
        Scanner scanner = new Scanner(System.in);
        
        //Get the number from the user
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        
        if (number >= 100 && number <= 999) {
            int reversedNumber = reverseNumber(number);
            System.out.println("Number: " + number + "  Output: " + reversedNumber);
        } else {
            System.out.println("Please enter a 3-digit number.");
        }
        
        scanner.close();
    }
	
    //Reverse function
    public static int reverseNumber(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            num /= 10; // Remove the last digit
        }
        
        return reversed;

	}

}
/*Output:
Enter a 3-digit number: 678
Number: 678  Output: 876*/
