package lab7;

public class Student {

	private String nameFirst;
	private String nameLast;
	private String name;
	private int id;
	private int credits = 0;
	private double gpa = 0;

	public Student(String fn, String ln, int id) {
		nameFirst = fn;
		nameLast = ln;
		this.id = id;

		this.name = nameFirst + " " + nameLast;
	}

	public String getName() {
		return name;
	}

	public int getStudentID() {
		return id;
	}

	public int getCredits() {
		return credits;
	}

	public double getGPA() {
		return gpa;
	}

	public String toString() {
		return getName() + " " + getStudentID();
	}

	/**
	 * Check credits
	 * 
	 * @return what year student is in
	 */

	public String getClassStanding() {
		if (credits < 30)
			return "FirstYear";
		else if (credits >= 30 && credits < 60)
			return "Sophomore";
		else if (credits >= 60 && credits < 90)
			return "Junior";
		else if (credits >= 90)
			return "Senior";
		return "";
	}

	/**
	 * 
	 * @param grade
	 * @param cred
	 * 
	 */

	public void submitGrade(double grade, int cred) {
		double old = gpa * credits;
		double update = grade * cred;
		credits = credits + cred;
		double hold = ((old + update) / credits);
		gpa = Math.round(hold * 1000.) / 1000.;
	}

	/**
	 * @param parent
	 * @return legacy  
	 */

	Student createLegacy(Student otherParent) {
		Student baby = new Student(this.name, otherParent.getName(), this.id + otherParent.getStudentID());

		baby.setGPA((this.gpa + otherParent.getGPA()) / 2);

		baby.setStudentID(this.id + otherParent.getStudentID());

		baby.setCredits(Math.max(this.credits, otherParent.getCredits()));

		return baby;

	}

	public void setStudentID(int newid) {
		id = newid;
	}

	public void setCredits(int credit) {
		credits = credit;
	}

	public void setGPA(double grade) {
		gpa = grade;
	}

}
