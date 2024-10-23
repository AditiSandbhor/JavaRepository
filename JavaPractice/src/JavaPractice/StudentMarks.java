package JavaPractice;

public class StudentMarks {

	
	public static void main(String[] args) {
		
		int examScore = 75;
		
		if(examScore>=90) {
			System.out.println("The grade is A+");
		}
		else if(examScore>=60) {
			System.out.println("The grade is A");
		}
		else if(examScore>=45) {
			System.out.println("The grade is B");
		}
		else if(examScore>=35) {
			System.out.println("The grade is C");
		}
		else if(examScore<35) {
			System.out.println("The grade is F");
		}
		else {
			System.out.println("The given score is not valid");
		}

	}

}
