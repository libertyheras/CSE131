package lab9;

import java.util.ArrayList;
import java.util.List;

public class WUggle {

	private String[][] board = new String[4][];

	/**
	 * A WUggle game
	 * 
	 * @param grid
	 *            a 4x4 array of Strings. The string at row r, 0 <= r < 4 and column
	 *            c, 0 <= c < 4 is stored at grid[r][c]
	 */
	public WUggle(String[][] grid) {
		for (int i = 0; i < grid.length; i++)
			board[i] = grid[i].clone();

	}

	/**
	 * 
	 * @param row
	 *            the starting row of the String we seek
	 * @param col
	 *            the starting column of the String we seek
	 * @param length
	 *            the length of the String we seek
	 * @return the String of the supplied length that occurs in the grid
	 *         horizontally, starting at the specified row and column
	 */
	public String horizontalWordAtRow(GridPos gp, int length) {
		int row, col;
		String str = "";

		row = gp.getRow();
		col = gp.getCol();
		
		for (int i = col; i<length+col;i++) {
			str = str + board[row][i];
		}
		
		

		return str; // FIXME
	}
	/**
	 * 
	 * @param row
	 *            the starting row of the String we seek
	 * @param col
	 *            the starting column of the String we seek
	 * @param length
	 *            the length of the String we seek
	 * @return the String of the supplied length that occurs in the grid
	 *         vertically, starting at the specified row and column
	 */
	public String verticalWordAtColumn(GridPos gp, int length) {
		int row, col;
		String str = "";

		row = gp.getRow();
		col = gp.getCol();
		
		for (int i = row; i<length+row;i++) {
			str = str + board[i][col];
		}
		
		

		return str; // FIXME
	}

}
