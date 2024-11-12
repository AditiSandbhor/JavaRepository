package JavaPractice;

class Bank_Customer {
    
    // Fields for Bank_Customer class
    private int acno;
    private String atype;
    private double amt;
    
    // Constructor to initialize all fields
    public Bank_Customer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }
    
    // Constructor to initialize account number and account type (default amount = 0)
    public Bank_Customer(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0;  // default amount is 0
    }
    
    // Constructor to initialize account number (default account type = "Savings", default amount = 0)
    public Bank_Customer(int acno) {
        this.acno = acno;
        this.atype = "Savings";  // default account type is "Savings"
        this.amt = 0.0;          // default amount is 0
    }
    
    // Method to display customer details
    public void displayCustomerInfo() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Account Balance: Rs" + amt);
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Creating Bank_Customer objects using different constructors
        
        // Using constructor with all fields
        Bank_Customer customer1 = new Bank_Customer(101, "Checking", 1500.0);
        
        // Using constructor with account number and account type
        Bank_Customer customer2 = new Bank_Customer(102, "Savings");
        
        // Using constructor with account number only
        Bank_Customer customer3 = new Bank_Customer(103);
        
        // Displaying customer information
        System.out.println("Customer 1 Details:");
        customer1.displayCustomerInfo();
        
        System.out.println("\nCustomer 2 Details:");
        customer2.displayCustomerInfo();
        
        System.out.println("\nCustomer 3 Details:");
        customer3.displayCustomerInfo();
    }
}
/* Output: Customer 1 Details:
Account Number: 101
Account Type: Checking
Account Balance: Rs1500.0

Customer 2 Details:
Account Number: 102
Account Type: Savings
Account Balance: Rs0.0

Customer 3 Details:
Account Number: 103
Account Type: Savings
Account Balance: Rs0.0
*/
