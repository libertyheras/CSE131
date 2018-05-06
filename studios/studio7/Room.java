package studio7;

public class Room {

	private int capacity;

	public Room(int capacity) {
		this.capacity = capacity;
	}

	public boolean check(int students) {
		if (capacity >= students) {
			return true;
		} else {
			return false;
		}
	}

}
