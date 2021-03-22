
public class testStudent {

	public static void main(String[] args) {
		// Create a new student named chris
		Student chris = new Student("Christopher", "Wohn",43245, 5, 1.4);
		
		// Display the starting record to the console
		chris.displayRecord();
		// Advance chris to next grade
		chris.promote();
		chris.displayRecord();
		chris.academicStanding();
		
	}

}
