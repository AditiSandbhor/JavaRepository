package JavaPractice;

public class SmallestElementInArray {

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {15, 44, 12, 63, 5, 34};

        // Call the function to find the smallest element
        int smallest = findSmallestElement(arr);

        // Print the smallest element
        System.out.println("The smallest element in the array is: " + smallest);
    }

    // Function to find the smallest element in the array
    public static int findSmallestElement(int[] array) {
        // Assume the first element is the smallest initially
        int smallest = array[0];

        // Traverse the array to find the smallest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Return the smallest element found
        return smallest;
    }
}
/*Output:
The smallest element in the array is: 5
*/
