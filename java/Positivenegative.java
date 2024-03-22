/* Java program to check whether the number is positive or not */


import java.util.Scanner;

class Positivenegative 
{
public static void main(String args[])
{
int num;
Scanner scin=new Scanner(System.in);
System.out.println("Enter the byte value : ");
num=scin.nextInt();
if(num>0)
{
System.out.println("It is Positive");
}
else
{
System.out.println("It is Negative ");
}

}
}

// Output


C:\Users\User1\Desktop\java programs>java Positivenegative
Enter the byte value :
15
It is Positive

C:\Users\User1\Desktop\java programs>java Positivenegative
Enter the byte value :
-2
It is Negative