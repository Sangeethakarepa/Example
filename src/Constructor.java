
public class Constructor {
	String st;
Constructor()
{
	System.out.println("Non Parameterized Constructor");
}
Constructor(String name)
{
	st=name;
	System.out.println("Parameterized Constructor");
}
Constructor(Constructor ob)
{
	st=ob.st;
	System.out.println("Copy Constructor called");
}
void display()
{
	System.out.println("Name is:"+st);
}
	
public static void main(String[] args) {
	@SuppressWarnings("unused")
	Constructor ob=new Constructor();
	Constructor ob1=new Constructor("Rahul");
	Constructor ob2=new Constructor(ob1);
	ob1.display();
	ob2.display();
	
	}
}


