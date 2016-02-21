package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() 
	{
		Calculator calculator = new Calculator();
		assertNotNull(calculator);
	}
	
	@Test
	public void testGetTotal()
	{
		Calculator calculator = new Calculator();
		assertEquals(calculator.getTotal(), 0);
	}
	
	@Test
	public void testAdd()
	{
		Calculator calculator = new Calculator();
		calculator.add(5);
		assertEquals(calculator.getTotal(), 5);
	}
	
	@Test
	public void testSubtract()
	{
		Calculator calculator = new Calculator();
		calculator.subtract(5);
		assertEquals(calculator.getTotal(), -5);
	}
	
	@Test
	public void testMultiply()
	{
		Calculator calculator = new Calculator();
		calculator.add(2);
		calculator.multiply(7);
		assertEquals(calculator.getTotal(), 14);
	}
	
	@Test
	public void testDivide()
	{
		Calculator calculator = new Calculator();
		calculator.add(56);
		calculator.divide(7);
		assertEquals(calculator.getTotal(), 8);
	}
	
	@Test
	public void testDivideByZero()
	{
		Calculator calculator = new Calculator();
		calculator.add(56);
		calculator.divide(0);
		assertEquals(calculator.getTotal(), 0);
	}
	
	@Test
	public void testGetHistory()
	{
		fail("Not Implemented Yet.");
	}
}