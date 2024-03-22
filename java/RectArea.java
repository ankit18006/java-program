class Rectangle
{
	int length, width;
	void getData(int x, int y)
	{
		length = x;
		width = y;
	}
	void rectArea()
	{
		int area = length * width;
		return (area);
	}
}
class RectArea
{
	public static void main(String args[])
	{
		int area1, area2;
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		Rect1.length = 15;
		rect1.width = 10;
		area = rect1.length * rect1.width;
		rect2.getData(20.12);
		area2 = rect2.rectArea();
		System.out.println("Area1 = "+ area1);
		System.out.println("Area2 = "+ area2);
	}
}

/*

RectArea.java:12: error: incompatible types: unexpected return value
                return (area);
                       ^
RectArea.java:12: error: incompatible types: int cannot be converted to void
                return (area);
                        ^
RectArea.java:24: error: cannot find symbol
                area = rect1.length * rect1.width;
                ^
  symbol:   variable area
  location: class RectArea
RectArea.java:25: error: method getData in class Rectangle cannot be applied to given types;
                rect2.getData(20.12);
                     ^
  required: int,int
  found: double
  reason: actual and formal argument lists differ in length
RectArea.java:26: error: incompatible types: void cannot be converted to int
                area2 = rect2.rectArea();
                                      ^
5 errors


*/