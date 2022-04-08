
public class cs2 {
	
	public cs2()
	{
		System.out.println("Running Zero paramter constructor");
	}

	public static void main(String[] args) {
	cs2 ob1=new cs2();//creating object
	 ob1.Test1();//calling non static method

	}
	public void Test1()//creating non static method
	{
		System.out.println("This is test1 method");
	}

}
