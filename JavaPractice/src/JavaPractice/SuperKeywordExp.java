package JavaPractice;


class ParentClass1{
	//Parent class constructor
	ParentClass1(){
		System.out.println("This is the Parent class constructor.");
	}
}

class ChildClass1 extends ParentClass1{
	//Child class constructor
	ChildClass1(){
		//using the super keyword to invoke parent class constructor
		super();
		System.out.println("This is the Child class constructor.");
	}
	
}
public class SuperKeywordExp {

	public static void main(String[] args) {
		ChildClass1 cc = new ChildClass1();//Declaring child class object

	}

}
/*Output: This is the Parent class constructor.
This is the Child class constructor.*/
