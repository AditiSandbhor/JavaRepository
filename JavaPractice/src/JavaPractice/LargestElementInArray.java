package JavaPractice;

public class LargestElementInArray {

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {10, 20, 23, 40, 35, 25};

        // Call the function to find the largest element
        int largest = findLargestElement(arr);

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }

    // Function to find the largest element in the array
    public static int findLargestElement(int[] array) {
        // Assume the first element is the largest initially
        int largest = array[0];

        // Traverse the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Return the largest element found
        return largest;
    }
}
/*Output:
The largest element in the array is: 40
*/
