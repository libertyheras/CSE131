package studio7;

public class HockeyPlayer {

	private int points = 0;
	private int jerseyNum;
	private int games = 0;
	private String name;
	private String side;
	private String shotFrom;

	public HockeyPlayer(String name, int jerseyNum, String side, String shotFrom) {
		this.name = name;
		this.jerseyNum = jerseyNum;
		this.side = side;
		this.shotFrom = shotFrom;
	}

	public void addPoints(int assists, int goals) {
		points = points + assists + goals;
		games++;
	}

	public int returnPoints() {
		return points;
	}

	public int returnGames() {
		return games;
	}

	public String returnSide() {
		return side;
	}

	public String returnShotFrom() {
		return shotFrom;
	}

	public String returnPlayerInfo() {
		return (name + " has " + jerseyNum);
	}

}
