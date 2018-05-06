package lab9.testing;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import lab9.GridPos;
import lab9.WUggle;

public class TestWUggle {
	private static String[] someLetters = new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H"
	};
	
	private Random random = new Random();
	
	@Test
	public void testRows() {
		for (int r=0; r<4; ++r) {
			for (int c=0; c<=1; ++c) {
				String[][] grid = genZs();
				String word = genRandomWord(4-c);
				for (int i=0; i < word.length(); ++i) {
					grid[r][i+c] = word.substring(i, i+1);
				}
				printArray(grid);
				GridPos start = new GridPos(r,c);
				System.out.println("At " + start + " looking for horizontal word " + word);
				WUggle wug = new WUggle(grid);
				assertEquals("Did not find the word " + word + " in row " + r + " starting at col " + c, word, wug.horizontalWordAtRow(start, 4-c));
			}
		}
	}
	
	@Test
	public void testCols() {
		for (int c=0; c<4; ++c) {
			for (int r=0; r<=1; ++r) {
				String[][] grid = genZs();
				String word = genRandomWord(4-r);
				for (int i=0; i < word.length(); ++i) {
					grid[i+r][c] = word.substring(i, i+1);
				}
				printArray(grid);
				GridPos start = new GridPos(r,c);
				System.out.println("At " + start + " looking for vertical word " + word);
				WUggle wug = new WUggle(grid);
				assertEquals("Did not find the word " + word + " in col " + c + " starting at row " + r, word, wug.verticalWordAtColumn(start, 4-r));
			}
		}
	}
	
	
	private static String[][] genZs() {
		String[][] ans = new String[4][];
		for (int i=0; i<4; ++i) {
			ans[i] = new String[4];
			for (int j=0; j<4; ++j) {
				ans[i][j] = "Z";
			}
		}
		return ans;
	}
	
	private String genRandomWord(int length) {
		String ans = "";
		for (int i=0; i < length; ++i) {
			ans = ans + someLetters[random.nextInt(someLetters.length)];
		}
		return ans;
	}
	
	private static void printArray(String[][] grid) {
		for (int r=0; r < grid.length; ++r) {
			for (int c=0; c < grid.length; ++c) {
				System.out.print(grid[r][c] + (grid[r][c].length()==1 ? "  " : " "));				
			}
			System.out.println();
		}

	}

}
