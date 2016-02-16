import static org.junit.Assert.*;

import org.junit.Test;


public class MyCalculatorTest {

	@Test
	public void testNfactorial_1() {
		MyCalculator cal = new MyCalculator();
		int actual = cal.nfactorial(0);
		assertEquals("Test NFactorial: 0! = 1", 1, actual,  0.0);
	}
	
	@Test
	public void testNfactorial_2() {
		MyCalculator cal = new MyCalculator();
		int actual = cal.nfactorial(1);
		assertEquals("Test NFactorial: 1! = 1", 1, actual,  0.0);
	}
	
	@Test
	public void testNfactorial_3() {
		MyCalculator cal = new MyCalculator();
		int actual = cal.nfactorial(10);
		assertEquals("Test NFactorial: 10! = 3628800", 3628800, actual,  0.0);
	}
	
	//@Test
	//public void testBinarySearch() {
	//	fail("Not yet implemented");
	//}

}
