package studio5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodsTest {

	@Test
	public void testSum() {
		//
		// Try something simple
		//
		assertEquals(7, Methods.sum(3, 4));
		//
		// Try something fancier
		//
		for (int i=0; i < 10; ++i) {
			assertEquals(i+i, Methods.sum(i, i));
		}
	}
	
	@Test
	public void thisTestShouldFail() {
		assertEquals(0, Methods.mpy(0,3));
		assertEquals(10, Methods.mpy(2, 5));
	}
	
	@Test
	public void testPig() {
		assertEquals("omputercay", Methods.pig("computer"));
		assertEquals("unfay", Methods.pig("fun"));
	}
	
	@Test
	public void testArraySum() {
		assertEquals(6.0, Methods.sumArray(new double[] { 1, 2, 3}), 0.1);
	}
	
	@Test
	public void testAvg3() {
		assertEquals(2.0, Methods.avg3(1,2,3), 0.1);		
	}
	
	@Test
	public void testAverage() {
		assertEquals(0.5, Methods.average(new double[] { 0, 1 }), 0.1);
	}
	
	@Test
	public void largest() {
		assertEquals(5, Methods.largest(new double[] { 0, 1, 2, 3, 4, 5 }), 0);
		assertEquals(10000, Methods.largest(new double[] { 0, 1, 2, 3, 4, 10000 }), 0);
	}

}
