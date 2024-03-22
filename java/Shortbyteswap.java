/* Java program to declare a variable of byte data type and short data type, accept the value from user, store the value and perform incrementation on byte data value and decrementation on short data value , swap the values without temporary variable */

import java.util.Scanner;

class Shortbyteswap 
{
public static void main(String args[])
{
byte b1;
short s1;
Scanner scin=new Scanner(System.in);
System.out.println("Enter the byte value : ");
b1=scin.nextByte();
System.out.println("Enter the short value : ");
s1=scin.nextShort();
b1++;
s1--;
System.out.println("Byte value before swapping : "+b1);
System.out.println("Short value before swapping : "+s1);
b1=(byte)(b1+s1);
s1=(short)(b1-s1);
b1=(byte)(b1-s1);
System.out.println("Byte value after swapping : "+b1);
System.out.println("Short value after swapping : "+s1);

}
}


// Output


C:\Users\User1\Desktop\java programs>java Shortbyteswap
Enter the byte value :
10
Enter the short value :
20
Byte value before swapping : 11
Short value before swapping : 19
Byte value after swapping : 19
Short value after swapping : 11

