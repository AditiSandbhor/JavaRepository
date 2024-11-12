package JavaPractice;

//Class Address representing an address with street, city, state, and zip code
class Address {
 // Attributes of the Address class
 private String street;
 private String city;
 private String state;
 private String zipCode;

 // Constructor to initialize address attributes
 public Address(String street, String city, String state, String zipCode) {
     this.street = street;
     this.city = city;
     this.state = state;
     this.zipCode = zipCode;
 }

 // Getter methods for each attribute
 public String getStreet() {
     return street;
 }

 public String getCity() {
     return city;
 }

 public String getState() {
     return state;
 }

 public String getZipCode() {
     return zipCode;
 }

 // Method to display the address in a readable format
 public void displayAddress() {
     System.out.println("Address: " + street + ", " + city + ", " + state + " " + zipCode);
 }
}

//Main class to test the Address class
public class AddressText {
 public static void main(String[] args) {
     // Creating an Address object with values
     Address address = new Address("Kothrud", "Pune", "Maharashtra", "411038");

     // Display the address
     address.displayAddress();
 }
}
/* Output: Address: Kothrud, Pune, Maharashtra 411038 */
