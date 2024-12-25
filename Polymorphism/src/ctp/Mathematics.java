package ctp;

public class Mathematics
{
	void mul()
	{
		int n=20,m=30,res;
		res=m*n;
		System.out.println(res);
	}
	void mul(int n)
	{
		int m=10,res=m*n;
		System.out.println(res);
	}
	public static void main(String[] args) {
		Mathematics m=new Mathematics();
		m.mul();
		m.mul(10);
	}

}
