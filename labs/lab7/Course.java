package lab7;

public class Course {
	private String name;
	private int credits;
	private int seats;
	private Student[] roster;

	public Course(String name, int credits, int seats) {
		this.name = name;
		this.credits = credits;
		this.seats = seats;
		this.roster = new Student[seats];

	}

	public String getName() {
		return name;
	}

	public int getRemainingSeats() {
		return seats;
	}

	/**
	 * 
	 * @param student
	 * @return if student is added to roster
	 */
	public boolean addStudent(Student student) {
		seats = seats - 1;
		if (getRemainingSeats() >= 0) {
			roster[roster.length - seats - 1] = student;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @return average gpa of class
	 */
	public double averageGPA() {
		double gpaTotal = 0;
		double hold = 0;
		for (int i = 0; i < roster.length; i++) {
			if (roster[i] != null) {
				gpaTotal = gpaTotal + roster[i].getGPA();
				hold++;
			}

		}
		return gpaTotal / hold;
	}

	/**
	 * @return course name and credits
	 */
	public String toString() {
		return "Course name: " + name + ", credits: " + credits;
	}

}