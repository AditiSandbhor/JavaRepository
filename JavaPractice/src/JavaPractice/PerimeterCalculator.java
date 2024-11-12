package JavaPractice;

class Perimeter {
    
    // Method to calculate the perimeter of a square
    public double calculatePerimeter(double s) {
        return 4 * s;  // Perimeter of square = 4 * side
    }
    
    // Method to calculate the perimeter of a rectangle
    public double calculatePerimeter(double l, double b) {
        return 2 * (l + b);  // Perimeter of rectangle = 2 * (length + breadth)
    }
    
    // Method to calculate the perimeter of a circle
    public double calculatePerimeter(double r) {
        return 2 * (22.0 / 7) * r;  // Perimeter of circle = 2 * (22/7) * radius
    }
}

public class PerimeterCalculator {
    public static void main(String[] args) {
        
        // Creating an object of the Perimeter class
        Perimeter perimeterCalculator = new Perimeter();
        
        // Calculating and displaying the perimeter of a square with side 5
        double squarePerimeter = perimeterCalculator.calculatePerimeter(5);
        System.out.println("Perimeter of the square: " + squarePerimeter);
        
        // Calculating and displaying the perimeter of a rectangle with length 10 and breadth 4
        double rectanglePerimeter = perimeterCalculator.calculatePerimeter(10, 4);
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
        
        // Calculating and displaying the perimeter of a circle with radius 7
        double circlePerimeter = perimeterCalculator.calculatePerimeter(7);
        System.out.println("Perimeter of the circle: " + circlePerimeter);
    }
}
/*Output: Perimeter of the square: 20.0
Perimeter of the rectangle: 28.0
Perimeter of the circle: 28.0
*/
