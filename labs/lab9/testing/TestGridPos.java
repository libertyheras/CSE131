package lab9.testing;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import lab9.GridPos;

public class TestGridPos {
	
	Random random = new Random();

	@Test
	public void testConstructor() {
		int row = random.nextInt(1000);
		int col = random.nextInt(1000);
		GridPos gp = new GridPos(row, col);
	}
	
	@Test
	public void testGetters() {
		int numTries = 1000 + random.nextInt(1000);
		for (int i=0; i < numTries; ++i) {
			int row = random.nextInt(1000);
			int col = random.nextInt(1000);
			GridPos gp = new GridPos(row, col);
			assertEquals("getRow() is not working", row, gp.getRow());
			assertEquals("getCol() is not working", col, gp.getCol());
		}
	}
	
	@Test
	public void testRightNeighbor() {
		int numTries = 1000 + random.nextInt(1000);
		for (int i=0; i < numTries; ++i) {
			int row = random.nextInt(1000);
			int col = random.nextInt(1000);
			GridPos gp = new GridPos(row, col);
			GridPos right = gp.rightNeighbor();
			assertEquals("rightNeighbor returning wrong row", row, right.getRow());
			assertEquals("rightNeighbor returning wrong col", col+1, right.getCol());
		}

	}
	
	@Test
	public void testDownNeighbor() {
		int numTries = 1000 + random.nextInt(1000);
		for (int i=0; i < numTries; ++i) {
			int row = random.nextInt(1000);
			int col = random.nextInt(1000);
			GridPos gp = new GridPos(row, col);
			GridPos down = gp.downNeighbor();
			assertEquals("downNeighbor returning wrong row", row+1, down.getRow());
			assertEquals("downNeighbor returning wrong col", col, down.getCol());
		}

	}
	
	@Test
	public void testNoMutate() {
		int numTries = 1000 + random.nextInt(1000);
		for (int i=0; i < numTries; ++i) {
			int row = random.nextInt(1000);
			int col = random.nextInt(1000);
			GridPos gp = new GridPos(row, col);
			GridPos right = gp.rightNeighbor();
			assertEquals("rightNeighbor should not mutate row", row, gp.getRow());
			assertEquals("rightNeighbor should not mutate col", col, gp.getCol());
		}
		for (int i=0; i < numTries; ++i) {
			int row = random.nextInt(1000);
			int col = random.nextInt(1000);
			GridPos gp = new GridPos(row, col);
			GridPos down = gp.downNeighbor();
			assertEquals("downNeighbor should not mutate row", row, gp.getRow());
			assertEquals("downNeighbor should not mutate col", col, gp.getCol());
		}

	}
	
	@Test
	public void testHashCode() {
		int numTries = 1000 + random.nextInt(1000);
		for (int i=0; i < numTries; ++i) {
			int row = random.nextInt(1000);
			int col = random.nextInt(1000);
			GridPos gp = new GridPos(row, col);
			GridPos gq = new GridPos(row, col);
			assertEquals("hashCode() not implemented correctly (or at all)", gp.hashCode(), gq.hashCode());
		}		
	}
	@Test
	public void testEquals() {
		int numTries = 1000 + random.nextInt(1000);
		for (int i=0; i < numTries; ++i) {
			int row = random.nextInt(1000);
			int col = random.nextInt(1000);
			GridPos gp = new GridPos(row, col);
			GridPos gs = new GridPos(row, col);
			GridPos gq = new GridPos(row, col+1);
			GridPos gr = new GridPos(row+1, col);
			assertEquals("equals() not implemented correctly (or at all)", true, gp.equals(gs));
			assertEquals("equals() not implemented correctly (or at all)", true, gp.equals(gs));
			assertEquals("equals() should think these two GridPos objects are different", false, gp.equals(gq));
			assertEquals("equals() should think these two GridPos objects are different", false, gp.equals(gr));
			assertEquals("equals() should think these two GridPos objects are different", false, gq.equals(gr));
		}		
	}
	
	@Test
	public void testToString() {
		int numTries = 1000 + random.nextInt(1000);
		for (int i=0; i < numTries; ++i) {
			int row = random.nextInt(1000);
			int col = random.nextInt(1000);
			GridPos gp = new GridPos(row, col);
			String s = gp.toString();
			assertTrue("You must implement a reasonable toString(): it should contain the row", s.contains(""+row));
			assertTrue("You must implement a reasonable toString(): it should contain the col", s.contains(""+col));
		}
	}

}
