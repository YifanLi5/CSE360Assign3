package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest extends Calculator {

	@Test
	public void testCalculator() {
		Calculator test = new Calculator();
		assertNotNull(test);
	}

	@Test
	public void testGetTotal() {
		Calculator test = new Calculator();
		test.add(5);
		assertEquals(test.getTotal(), 5);
	}

	@Test
	public void testAdd() {
		Calculator test = new Calculator();
		test.add(8);
		assertEquals(test.getTotal(), 8);
	}

	@Test
	public void testSubtract() {
		Calculator test = new Calculator();
		test.add(8);
		test.subtract(4);
		assertEquals(test.getTotal(), 4);
	}

	@Test
	public void testMultiply() {
		Calculator test = new Calculator();
		test.add(8);
		test.multiply(5);
		assertEquals(test.getTotal(), 40);
	}

	@Test
	public void testDivide() {
		Calculator test = new Calculator();
		test.add(8);
		test.multiply(5);
		test.divide(5);
		assertEquals(test.getTotal(), 8);
		test.divide(0);
		assertEquals(test.getTotal(), 0);
	}

	@Test
	public void testGetHistory() {
		Calculator test = new Calculator();
		test.add (4);
		test.subtract (2);
		test.multiply (2);
		test.add(5);
		assertEquals(test.getHistory(), "0 + 4 - 2 * 2 + 5");
	}

}
