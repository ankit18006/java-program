

class Property {
    public static void main(String args[]) {
        
        short a = 120;
        byte b = 20;

      	System.out.println("+ : " +(a+b));
	System.out.println("- : " +(a-b));
	System.out.println("* : " +(a*b));
	System.out.println("% : " +(a%b));
	System.out.println("/ : " +(a/b));
	System.out.println("> : " +(a>b));
	System.out.println(">= : " +(a>=b));
	System.out.println("< : " +(a<b));
	System.out.println("<= : " +(a<=b));
	System.out.println("<> : " +(a<>b));
	System.out.println("!= : " +(a!=b));
	System.out.println(">> : " +(a>>b));
	System.out.println("<< : " +(a<<b));
	System.out.println(">>> : " +(a>>>b));
	System.out.println("&& : " +(a&&b));
	System.out.println("|| : " +(a||b));
	System.out.println("& : " +(a&b));
	System.out.println("| : " +(a|b));
    }
}

// Output Before:

PS C:\Users\User1\Desktop\java programs> javac property.java
property.java:66: error: illegal start of expression
        System.out.println("<> : " +(a<>b));
                                       ^
1 error

PS C:\Users\User1\Desktop\java programs> javac property.java
property.java:61: error: bad operand types for binary operator '&&'
        System.out.println("&& : " +(a&&b));
                                      ^
  first type:  short
  second type: byte
property.java:62: error: bad operand types for binary operator '||'
        System.out.println("|| : " +(a||b));
                                      ^
  first type:  short
  second type: byte
2 errors

*/

class Property {
    public static void main(String args[]) {
        
        short a = 120;
        byte b = 20;

      	System.out.println("+ : " +(a+b));
	System.out.println("- : " +(a-b));
	System.out.println("* : " +(a*b));
	System.out.println("% : " +(a%b));
	System.out.println("/ : " +(a/b));
	System.out.println("> : " +(a>b));
	System.out.println(">= : " +(a>=b));
	System.out.println("< : " +(a<b));
	System.out.println("<= : " +(a<=b));
		//System.out.println("<> : " +(a<>b));
	System.out.println("!= : " +(a!=b));
	System.out.println(">> : " +(a>>b));
	System.out.println("<< : " +(a<<b));
	System.out.println(">>> : " +(a>>>b));
		//System.out.println("&& : " +(a&&b));
		//System.out.println("|| : " +(a||b));
	System.out.println("& : " +(a&b));
	System.out.println("| : " +(a|b));
    }
}


// Output After:

PS C:\Users\User1\Desktop\java programs> javac property.java
PS C:\Users\User1\Desktop\java programs> java property
+ : 140
- : 100
* : 2400
% : 0
/ : 6
> : true
>= : true
< : false
<= : false
!= : true
>> : 0
<< : 125829120
>>> : 0
& : 16
| : 124

