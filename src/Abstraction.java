
abstract class Abstraction {
int x,y;
abstract void fun1();
void fun2()
{
	x=x+1;
	y=y+1;
	System.out.println(x);
	System.out.println(y);
}
}
class Sample extends Abstraction
{
	void fun1()
	{
		x=x++;
		y=y--;
		System.out.println(x);
		System.out.println(y);
	}
	

	}
