import java.util.Scanner;

abstract class Shape {
float area;
Scanner sc=new Scanner(System.in);
abstract void findArea();
public void show()
{
	System.out.println("Area is:"+area);
}
}
class Circle extends Shape
{
	int r;
	void findArea()
	{
		System.out.println("Enter Radious:");
		r=sc.nextInt();
		area=3.14f*r*r;
		show();
	}
}
class Triangle extends Shape{
	int base,height;
	void findArea() {
		
		System.out.println("Enter Base and Height:");
		base=sc.nextInt();
		height=sc.nextInt();
		area=0.5f*base*height;
		show();
		
	}
	
}
	


