package samples;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import samples.exceptions.InvalidInputException;

public final class CalculatorTest {

	private Calculator calculator = null;
	
	@Before
	public void init ()
	{
		calculator = new Calculator();
	}
	
	
	@Test
	public void test_empty ()
	{
		assertEquals("", calculator.add(""));
	}
	
	@Test
	public void test_one_number ()
	{
		assertEquals("1", calculator.add("1"));
	}
	
	@Test
	public void test_two_number ()
	{
		assertEquals("6", calculator.add("1,5"));
	}
	
	@Test
	public void test_three_number_lf ()
	{
		assertEquals("7", calculator.add("1\n5\n1", "\n"));
	}
	
	@Test
	public void test_three_number_crlf ()
	{
		assertEquals("7", calculator.add("1\r\n5\n1", "\r?\n"));
	}
	
	@Test(expected = InvalidInputException.class)
	public void test_with_exception ()
	{
		assertEquals("7", calculator.add("1\r\n5\nx1", "\r?\n"));
	}
}
