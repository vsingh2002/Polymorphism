package ctp;

public class Customer 
{
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.purchase(10000);
		a.purchase("Inner Wear");
		a.purchase(100, "T-Shirt");
		a.purchase("Joggers", 20000);
	}

}
