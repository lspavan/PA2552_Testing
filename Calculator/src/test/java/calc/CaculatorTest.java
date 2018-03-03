package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));

	}
	@Test
	public void testAdd1() {
		assertEquals(5, calc.add(2,3));

	}

@Test
	public void testAdd2() {
		assertEquals(5, calc.add(2,3));

	}
	
	@Test
	public void testAdd3() {
		assertEquals(5, calc.add(2,3));

	}
	
	@Test
	public void testAdd3() {
		assertEquals(5, calc.add(2,3));

	}

	
}
