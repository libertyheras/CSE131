package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		assertEquals(0, Add.add(0, 0));
		//
		// write other test cases here:
		//
		for (int i =  0;i<10; i++) {
			assertEquals(i, Add.add(0, i));
			assertEquals(i, Add.add(i, 0));
		}
	}
	
	public void neg() {
		assertEquals(-2, Add.addAny(-4, 2));
		assertEquals(-2, Add.addAny(2, -4));
	}
	
	

}
