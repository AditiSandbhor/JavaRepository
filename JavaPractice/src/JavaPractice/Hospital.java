package JavaPractice;

//Parent class Doctor (for both multilevel and hierarchical inheritance)
class Doctor {
 // Attributes of the Doctor class
 protected String name;
 protected int age;

 // Constructor to initialize Doctor attributes
 public Doctor(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to simulate a doctor's work
 public void work() {
     System.out.println(name + " is diagnosing patients.");
 }

 // Method to display doctor information
 public void displayInfo() {
     System.out.println("Doctor: " + name + ", Age: " + age);
 }
}

//Child class Surgeon (multilevel inheritance, extends Doctor)
class Surgeon extends Doctor {
 // Constructor to initialize Surgeon attributes
 public Surgeon(String name, int age) {
     super(name, age);  // Call the parent class constructor
 }

 // Overriding the work() method to specify Surgeon duties 
 public void work() {
     System.out.println(name + " is performing surgery.");
 }
}

//Child class Nurse (hierarchical inheritance, extends Doctor)
class Nurse extends Doctor {
 // Constructor to initialize Nurse attributes
 public Nurse(String name, int age) {
     super(name, age);  // Call the parent class constructor
 }

 // Overriding the work() method to specify Nurse duties
 public void work() {
     System.out.println(name + " is assisting with patient care.");
 }
}

//Main class to test multilevel and hierarchical inheritance
public class Hospital {
 public static void main(String[] args) {
     // Creating objects for Surgeon and Nurse
     Doctor doctor = new Doctor("Dr. Patel", 45);
     Surgeon surgeon = new Surgeon("Dr. Kulkarni", 38);
     Nurse nurse = new Nurse("Nurse Sunita", 30);

     // Displaying information and work for each class
     System.out.println("\n---- Doctor Info ----");
     doctor.displayInfo();
     doctor.work();

     System.out.println("\n---- Surgeon Info ----");
     surgeon.displayInfo();
     surgeon.work();

     System.out.println("\n---- Nurse Info ----");
     nurse.displayInfo();
     nurse.work();
 }
}
/*Output: --- Doctor Info ----
Doctor: Dr. Patel, Age: 45
Dr. Patel is diagnosing patients.

---- Surgeon Info ----
Doctor: Dr. Kulkarni, Age: 38
Dr. Kulkarni is performing surgery.

---- Nurse Info ----
Doctor: Nurse Sunita, Age: 30
Nurse Sunita is assisting with patient care.
*/

