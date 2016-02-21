package cse360assign3;

/**
 * Class to act as a calculator. Commands are given to the calculator through add, subtract,
 * multiply, and divide, and the total is updated. The history of each command will also 
 * be stored and can be accessed through getHistory().
 * @author Richard Tuznik (PIN 825)
 */
public class Calculator
{

	private int total;
	
	/**
	 * Creates an instance of Calculator. Total is zero by default.
	 */
	public Calculator ()
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal - Get the calculator result based on previous commands
	 * @return The result/total of the calculations
	 */
	public int getTotal ()
	{
		return 0;
	}
	
	/**
	 * add - Add the value to the total
	 * @param value The value to be added
	 */
	public void add (int value)
	{

	}
	
	/**
	 * subtract - Subtract the value from the total
	 * @param value The value to be subtracted
	 */
	public void subtract (int value)
	{

	}
	
	/**
	 * multiply - Multiply the value with the result
	 * @param value The value to be multiplied
	 */
	public void multiply (int value)
	{

	}
	
	/**
	 * divide - Divide the value from the result
	 * @param value The value to divide by
	 */
	public void divide (int value)
	{

	}
	
	/**
	 * getHistory - Get the command history for the calculator
	 * @return The command history
	 */
	public String getHistory () 
	{
		return "";
	}
}
