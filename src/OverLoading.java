
public class OverLoading {
int a,b;
int add(int a,int b)
{
	return a+b;
}
double add(double a, double b)
{
	return a+b;
}
	public static void main(String[] args) {
		OverLoading a=new OverLoading();
		System.out.println("The Sum is:"+a.add(10, 10));
		System.out.println("The Sum is:"+a.add(10.5, 10.5));

	}

}
