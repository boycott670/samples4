package samples;

import org.junit.After;
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
	
	@Test(expected = UnsupportedOperationException.class)
	public void test_not_supported ()
	{
		output = calculator.eval("2");		
	}
	
	@After
	public void post_test ()
	{
		
	}
}