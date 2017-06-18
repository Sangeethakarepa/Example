import java.util.Scanner;
class inputValues
{
	public static void main(String[] args)
	{
	int id;
	String name,addr,job;
	double salary;
	@SuppressWarnings("resource")
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter Employee Details:");
	id=ob.nextInt();
	name=ob.next();
	addr=ob.next();
	job=ob.next();
	salary=ob.nextDouble();
	System.out.println("Employee ID:"+id+"Employee Name:"+name+"Employee Address:"+addr+"Empllooyee Job:"+job+"Employee Salary:"+salary);
	}
}