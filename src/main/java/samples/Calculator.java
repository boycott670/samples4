package samples;

import java.util.Arrays;

public final class Calculator extends Object
{
	public final String eval (final String input)
	{
		if (input == null || input.isEmpty())
		{
			return "";
		}
		
		if (input.contains("+") && !input.substring(input.indexOf('+') + 1).contains("+"))
		{
			return String.valueOf(Arrays.stream(input.split("\\+")).map(String::trim).mapToInt(Integer::valueOf).sum());
		}

		if (input.contains("-") && !input.substring(input.indexOf("-") + 1).contains("-"))
		{
			final int[] operands = Arrays.stream(input.split("\\-")).map(String::trim).mapToInt(Integer::valueOf).toArray();
			
			return String.valueOf(operands[0] - operands[1]);
		}
		
		throw new UnsupportedOperationException("Not yet implemented !");
	}
}