package studio7;

public class Die {

	private int sides;

	public Die(int sides) {
		this.sides = sides;
	}

	public int getRoll() {
		return ((int) Math.round(Math.random() * (sides - 1)) + 1);
	}

}
