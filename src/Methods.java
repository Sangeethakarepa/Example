
public class Methods {
private int x,y;
void Setx(int a)
{
	x=a;
}
void Sety(int b)
{
	y=b;
}
int Getx()
{
	return x;
}
int Gety()
{
	return y;
}
	public static void main(String[] args) {
		Methods ob=new Methods();
		ob.Setx(10);
		ob.Sety(10);
	System.out.println("X value is"+ob.Getx());
	System.out.println("Y value is"+ob.Gety());
	}

}
