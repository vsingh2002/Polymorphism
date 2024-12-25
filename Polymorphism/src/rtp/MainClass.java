package rtp;

public class MainClass
{
	//1. Employee emp=new developer();  -->emp.work() 
	//2. Employee emp=new Tester(); -->emp.work();
	static void display(Employee emp)
	{
		emp.work();
	}
	public static void main(String[] args)
	{
		//1.Upcasting using method
		display(new Developer());
		display(new Tester());
		System.out.println("--------");
		//2. Separate reference Variable
		Employee e1=new Developer(); //Rule 3.Upcasting
		e1.work();
		Employee e2=new Tester();
		e2.work();
		System.out.println("-------");
		Employee emp;
		emp=new Developer();
		emp.work();
		emp=new Tester();
		emp.work();
	}

}

/* Myself Vishal Singh. I am from Lucknow UttarPradesh.
 * currently living in Bangalore .I have completed my graduation from BBD Lucknow 
 * I have*/  
