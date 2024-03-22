
import java.util.Scanner;

class Switchcase
{
	public static void main(String[ ] arg)
	{
	Scanner scin=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=scin.nextInt();	 
	switch(num)
	{
	 case 1  : System.out.println("Sunday");
		break;
	 case 2  : System.out.println("Monday");
		break;
	 case 3  : System.out.println("Tuesday");
		break;
	 case 4  : System.out.println("Wednesday");
		break;
	 case 5  : System.out.println("Thursday");
		break;
	 case 6  : System.out.println("Friday");
		break;
	 case 7  : System.out.println("Saturday");
		break;
	default: System.out.println("Enter numbers between 1 to 7 ");
	 
	}
	
	}
}

// Output
C:\Users\User1\Desktop\java programs>javac Switchcase.java

C:\Users\User1\Desktop\java programs>java Switchcase
Enter a number :
4
Wednesday


*/

import java.util.Scanner;
class Switchcase
{
	public static void main(String[ ] arg)
	{
	Scanner scin=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=scin.nextInt();	 
	switch(num)
	{
	 case 1  : System.out.println("Sunday");
	
	 case 2  : System.out.println("Monday");
		
	 case 3  : System.out.println("Tuesday");
		
	 case 4  : System.out.println("Wednesday");
	
	 case 5  : System.out.println("Thursday");
		
	 case 6  : System.out.println("Friday");
		
	 case 7  : System.out.println("Saturday");
		
	default: System.out.println("Enter numbers between 1 to 7 ");
	 
	}
	
	}
}

// Output 


C:\Users\User1\Desktop\java programs>java Switchcase
Enter a number :
1
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
Enter numbers between 1 to 7

C:\Users\User1\Desktop\java programs>java Switchcase
Enter a number :
6
Friday
Saturday
Enter numbers between 1 to 7