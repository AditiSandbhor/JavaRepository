//Step 1: Define the Person interface with the speak method
interface Person {
 void speak();  // Abstract method
}

//Step 2: Create the Student class that implements Person interface
class Student implements Person {
 public void speak() {
     System.out.println("I am a student. I am learning Java!");
 }
}

//Step 3: Create the Teacher class that implements Person interface
class Teacher implements Person {
 public void speak() {
     System.out.println("I am a teacher. I teach Java!");
 }
}

//Step 4: Main class to create objects of Student and Teacher and call the speak method
public class InterfaceExample1 {
 public static void main(String[] args) {
     // Create objects of Student and Teacher
     Person student = new Student();
     Person teacher = new Teacher();

     // Call the speak method on both objects
     student.speak();  
     teacher.speak(); 
}
}
/*Output: 
 * I am a student. I am learning Java!
I am a teacher. I teach Java!
*/
