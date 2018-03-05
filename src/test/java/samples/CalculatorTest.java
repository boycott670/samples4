package samples;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public final class CalculatorTest
{
	private Calculator calculator = null;
	private String output = null;
	
	@Before
	public void init ()
	{
		calculator = new Calculator();
	}

	@Ignore
	public void test_null_input ()
	{
		output = calculator.eval(null);
	}
	
	@Ignore
	public void test_empty_input ()
	{
		output = calculator.eval("");
	}
	
	@Ignore
	public void test_not_supported ()
	{
		output = calculator.eval("2");		
	}

	@Test
	public void test_minus_operator ()
	{
		assertEquals("0", calculator.eval("2-2"));
	}
	
	@Test
	public void test_minus_operator_2 ()
	{
		assertEquals("-2", calculator.eval("0-2"));
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void test_minus_operator_3 ()
	{
		calculator.eval("2-2-");
	}
}