import java.util.Arrays;

import samples.exceptions.InvalidInputException;

public final class Calculator {

	public final String add (final String input, final String separator)
	{
		
		try
		{
			return input == null || input.isEmpty() ? "" : String.valueOf(Arrays.stream(input.split(separator)).map(String::trim).mapToInt(Integer::valueOf).sum());
		}
		catch (final NumberFormatException numberFormatException)
		{
			throw new InvalidInputException();
		}
		
	}
	
	public final String add (final String input)
	{
		
		return add(input, ",");
		
	}
	
}