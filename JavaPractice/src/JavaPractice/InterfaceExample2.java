package JavaPractice;

//Step 1: Define the Shape interface with the getArea() method
interface Shape {
 double getArea();  // Abstract method to get the area of the shape
}

//Step 2: Create the Rectangle class that implements Shape interface
class Rectangle implements Shape {
 private double length;
 private double width;

 // Constructor to initialize length and width
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implement the getArea method
 public double getArea() {
     return length * width;  // Area of rectangle = length * width
 }
}

//Step 3: Create the Circle class that implements Shape interface
class Circle implements Shape {
 private double radius;

 // Constructor to initialize the radius
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implement the getArea method
 public double getArea() {
     return Math.PI * radius * radius;  // Area of circle = π * r^2
 }
}

//Step 4: Create the Triangle class that implements Shape interface
class Triangle implements Shape {
 private double base;
 private double height;

 // Constructor to initialize base and height
 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 // Implement the getArea method
 public double getArea() {
     return 0.5 * base * height;  // Area of triangle = 1/2 * base * height
 }
}

//Step 5: Main class to create objects of Rectangle, Circle, and Triangle, and display their areas
public class InterfaceExample2 {
 public static void main(String[] args) {
     // Create objects of each shape
     Shape rectangle = new Rectangle(15.0, 5.0);  // Rectangle with length=5, width=3
     Shape circle = new Circle(4.0);              // Circle with radius=4
     Shape triangle = new Triangle(6.0, 4.0);     // Triangle with base=6, height=4

     // Display the areas of each shape
     System.out.println("Area of Rectangle: " + rectangle.getArea());
     System.out.println("Area of Circle: " + circle.getArea());
     System.out.println("Area of Triangle: " + triangle.getArea());
 }
}
/*Output: 
Area of Rectangle: 75.0
Area of Circle: 50.26548245743669
Area of Triangle: 12.0
*/
