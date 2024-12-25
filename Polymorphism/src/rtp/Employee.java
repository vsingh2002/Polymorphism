package rtp;

class Employee 
{
	void work()
	{
		System.out.println("Working");
	}
}
class Developer extends Employee //rule-1
{
	@Override
	void work()  //rule-2
	{
		System.out.println("Developing App");
	}
}
class Tester extends Employee  //rule-1
{
	@Override
	void work() //rule-2
	{
		System.out.println("Testing App");
	}
}


