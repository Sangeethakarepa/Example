
public class Base {
void show()
{
	System.out.println("This is Base class");
}
void disp()
{
	System.out.println("This is  display method of Base class");
}
}
class Derive extends Base{
	void show()
	{
		super.show();
		System.out.println("This is Derive class");
	}
	void disp()
	{
		super.disp();
		System.out.println("This is  display method of Derive class");
	}

	
}

