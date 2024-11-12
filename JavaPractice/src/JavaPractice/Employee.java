package JavaPractice;

public class Employee {
	// Private fields (Encapsulation)
    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;

    // Default constructor (optional, but it's good practice)
    public Employee() {
        // No-arg constructor
    }

    // Parameterized constructor (to initialize the employee details)
    public Employee(int empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    // Getter and Setter methods for each field

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    // toString() method to print employee details
    @Override
    public String toString() {
        return "Employee [EmpId=" + empId + ", EmpName=" + empName + ", EmpAge=" + empAge + ", EmpSalary=" + empSalary + "]";
    }

    // Main method to test the Employee Bean class

	public static void main(String[] args) {
		// Create an Employee object using the parameterized constructor
        Employee employee = new Employee(101, "Aditi Sandbhor", 21, 50000.0);

        // Print the employee details
        System.out.println(employee);  // This will call the toString() method

        // Using setter and getter methods to modify and access employee details
        employee.setEmpSalary(55000.0);  // Update salary
        System.out.println("Updated Salary: " + employee.getEmpSalary());
		
	}

}
/*Employee [EmpId=101, EmpName=Aditi Sandbhor, EmpAge=21, EmpSalary=50000.0]
Updated Salary: 55000.0
*/
