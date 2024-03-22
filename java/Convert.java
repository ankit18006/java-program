
class Convert {

    public static void main(String args[]) {
       
     	byte byteValue = 90;

        short shortValue = byteValue;
	
	char ch = 'A';
	
	int value=(char)ch;
        
	double doubleValue = 45.10;

        int num = doubleValue;

        

       
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Byte to Short Value: " + shortValue);
        System.out.println("Char Value: " + ch);
        System.out.println("Char to Integer Value: " + value);
	System.out.println("Double to Integer Value: " + num);
    }
   
}


// Output Before Conversion:

PS C:\Users\User1\Desktop\java programs> javac convert.java
convert.java:38: error: incompatible types: possible lossy conversion from double to int
        int num = doubleValue;
                  ^
1 error

*/

class Convert {

    public static void main(String args[]) {
       
        byte byteValue = 90;

        short shortValue = byteValue;
	
	char ch = 'A';
	
	int value=(char)ch;
        
	double doubleValue = 45.10;

        int num = (int)doubleValue;

        // before
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Byte to Short Value: " + shortValue);
        System.out.println("Char Value: " + ch);
        System.out.println("Char to Integer Value: " + value);
	System.out.println("Double to Integer Value: " + num);
    }
}


Output After Conversion:

PS C:\Users\User1\Desktop\java programs> javac convert.java
PS C:\Users\User1\Desktop\java programs> java convert
Byte Value: 90
Byte to Short Value: 90
Char Value: A
Char to Integer Value: 65
Double to Integer Value: 45

