package JavaPractice;

public class BankCustomer {
	// Declaring fields
    private int acno;      // Account number
    private String atype;  // Account type (e.g., savings, checking)
    private double amt;    // Account balance

    // Parameterized constructor to initialize fields
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Getter methods to access the fields
    public int getAcno() {
        return acno;
    }

    public String getAtype() {
        return atype;
    }

    public double getAmt() {
        return amt;
    }

    // Setter methods to modify the fields
    public void setAcno(int acno) {
        this.acno = acno;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Account Balance: " + amt);
    }

	public static void main(String[] args) {
		// Creating an object of BankCustomer using parameterized constructor
        BankCustomer customer = new BankCustomer(101, "Savings", 5000.75);

        // Displaying the customer details
        customer.displayCustomerDetails();
		

	}

}
/* Output:Account Number: 101
Account Type: Savings
Account Balance: 5000.75
 */
