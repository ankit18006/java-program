class Room
{
	float length;
	float breadth;
	Room(float x, float y)
	{
		length = x;
		breadth = y;
	}
	Room(float x)
	{
		length = breadth = x;
	}
	int area()
	{
		return (length * breadth);
	}
}

/*

C:\Users\User1\Desktop\java programs\21022024>javac Room.java
Room.java:16: error: incompatible types: possible lossy conversion from float to int
                return (length * breadth);
                               ^
1 error

*/