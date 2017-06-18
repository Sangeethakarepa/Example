import java.util.Scanner;
public class Method {
int id;
String name,addr;
double salary;
Scanner sc=new Scanner(System.in);
void inPut()
{
	System.out.println("Enter Employee ID:");
	id=sc.nextInt();
	System.out.println("Enter Employee Name:");
	name=sc.next();
	System.out.println("Enter Employee Address:");
	addr=sc.next();
	System.out.println("Enter Employee Salary:");
	salary=sc.nextDouble();
}
void outPut()
{
	System.out.println("Employee ID:"+id+"Employee Name:"+name+"Employee Address:"+addr+"Employee Salary:"+salary);
}
	public static void main(String[] args) {
	Method a=new Method();
	a.inPut();
	a.outPut();
	}

}
