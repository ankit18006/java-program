class MathOperation
{
	static float mul(float x, float y)
	{
		return x*y;
	}
	static float divide(float x, float y)
	{
		return x/y;
	}
}
class MathApplication
{
	public static void main(String args[])
	{
		float a = MathOperation.mul(4.0,5.0);
		float b = MathOperation.divide(a,2.0);
		System.out.println("b = " +b);
	}
}

/*

MathApplication.java:16: error: incompatible types: possible lossy conversion from double to float
                float a = MathOperation.mul(4.0,5.0);
                                            ^
MathApplication.java:17: error: incompatible types: possible lossy conversion from double to float
                float b = MathOperation.divide(a,2.0);
                                                 ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
2 errors

*/