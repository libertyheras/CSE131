package studio7;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getPerimeter() {
		return ((2 * length) + (2 * width));
	}

	public int getArea() {
		return length * width;
	}

	public boolean square() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}

	public boolean compare(int area) {
		if (getArea() > area) {
			return true;
		} else {
			return false;
		}
	}

	public void rotate90() {
		int tmp = length;
		length = width;
		width = tmp;
	}

	public boolean point(int x, int y) {
		if (width > x && length > y) {
			return true;
		} else {
			return false;
		}
	}

	public boolean intersect(int x, int y) {
		if (width > x && length > y) {
			return true;
		} else {
			return false;
		}

	}

}
