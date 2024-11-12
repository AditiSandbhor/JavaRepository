package JavaPractice;

// Class B which holds a reference to an instance of class A4
class B {
    A4 obj;  // Field to hold the reference to an A4 object

    // Constructor of B that takes an A4 object as a parameter
    B(A4 obj) {
        this.obj = obj;  // Assign the A4 object passed in the constructor to the obj field
    }

    // Method to display the data from the A4 object
    void display() {      
        System.out.println(obj.data); 
    }
}

// Class A4 which contains an integer data and creates an instance of B
class A4 {
    int data = 10;  // An integer data field initialized to 10

    // Constructor of A4 class
    A4() {
        // Creating an instance of class B and passing 'this' (the current A4 instance) as a parameter
        B b = new B(this);
        b.display(); 
    }

    public static void main(String[] args) {
        // Create an instance of A4, which triggers the constructor of A4
        A4 a = new A4(); 
    }
}
/*Output:10*/
