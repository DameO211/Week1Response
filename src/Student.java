
public class Student {
	
	private final String firstName;
	private final double GPA;
	private final String lastName;
	private int grade;
	private final int studentID;
	
	public Student(String fn, String ln, int ID, int grd, double gpa) {
		firstName = fn;
		lastName = ln;
		studentID = ID;
		grade = grd;
		GPA = gpa;
	}

	public void displayRecord() {
		System.out.println(
				"Student: " + firstName + ", " + lastName +
				"\n" + "ID#: " + grade +
				"\n" + "Grade: " + grade +
				"\n" + "GPA: " + GPA +
				"\n");
	}

	public void promote() {
		this.grade = this.grade + 1;
	}

	public boolean academicStanding(){

		boolean passing = false;


		passing = this.GPA > 2.0;
		System.out.println(passing);


		return passing;
	}
}
