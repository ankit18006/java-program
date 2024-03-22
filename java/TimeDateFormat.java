import java.util.*;

class TimeDateFormat
{
	public static void main(String args[])
	{
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
	
		fmt.format("%tr", cal);
		System.out.println(fmt);
		fmt.close();

		fmt = new Formatter();
		fmt.format("tl:%tM", cal, cal);
		System.out.println(fmt);
		fmt.close();
	
		fmt = new Formatter();
		fmt.format("tB %tb %tm", cal, cal, cal);
		System.out.println(fmt);
		fmt.close();
	}
}

/*

09:41:28 PM
tl:41
tB Feb 02

*/