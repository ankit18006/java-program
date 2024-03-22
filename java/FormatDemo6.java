import java.util.*;

class FormatDemo6
{
	public static void main(String args[])
	{
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		fmt.format("Today is day %te of %<ty", cal);
		System.out.println(fmt);
		fmt.close();
	}
}

// Today is day 21 of 24