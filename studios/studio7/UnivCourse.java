package studio7;

import studio7.Room;

public class UnivCourse {

	Room r = new Room(100);

	private String name, department;
	private int students;

	public UnivCourse(String name, String department, int students) {
		this.name = name;
		this.department = department;
		this.students = students;
	}

	public void addStudents(int num) {
		students = students + num;
	}

	public void dropStudents(int num) {
		students = students - num;
	}

	public int enrolled() {
		return students;
	}

	public boolean fit() {
		return r.check(students);

	}

}
