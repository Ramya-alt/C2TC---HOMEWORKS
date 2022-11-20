package c2tc;
public class Shape {
	string color;
	int sides;
	float length;
	float breadth;
}
public void area(float l,float b)
{ 
	length=l;
	breadth=b;
	area=length*breadth;
	system.out.println(area)
}

public void findsides()
{
	System.out.println('Enter the no of sides: ')
}

	public static void main(String[] args) {
		Shape circle=new Shape;
		Shape rectangle=new Shape;
		rectangle.area(5.5f, 6);
		
		// TODO Auto-generated method stub

	}

}
