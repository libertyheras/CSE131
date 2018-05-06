package lab9;

import lab7.Student;

/**
 * A class to represent a row and column of a WUggle board. For our game, the
 * indexes will go from 0 to 3 inclusively in each direction, But for generality
 * no need to check for that here.
 * 
 * You can generate most of the methods of this class automatically by eclipse
 * based on the two provided instance variables: row and col.
 * 
 * @author roncytron
 *
 */
public class GridPos {

	private final int row, col;

	/**
	 * 
	 * @param row
	 * @param col
	 * 
	 * constructor
	 */
	
	public GridPos(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
/**
 * getters
 * @return
 */
	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	/**
	 * Hashcode
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + row;
		return result;
	}
/**
 * equals
 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GridPos other = (GridPos) obj;
		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
/**
 * to string
 */
	@Override
	public String toString() {
		return "GridPos [row=" + row + ", col=" + col + "]";
	}

	//
	// Add the constructor and other methods as needed
	//
/**
 * gens right neigbhor val
 * @return gridpos obj with val of right neigbhor
 */
	public GridPos rightNeighbor() {
		GridPos right = new GridPos(getRow(), getCol() + 1);

		return right;
	}
/**
 * gesn down neigbhor val
 * @return gridpos  obj with val of down neigbhor
 */
	public GridPos downNeighbor() {
		GridPos down = new GridPos(getRow() + 1, getCol());

		return down;
	}

}