
public class CS4 {
	int a;//variable declaration
	int b;
	int c;
	CS4()//constructor with zero parameter
	
	{
		a=100;
		b=200;
		c=300;
		System.out.println("Zero parameter constructor is running");
	}
	CS4(int num1)//constructor with one parameter
	{
		a=num1;
		System.out.println("Running constructor with one parameter");
	}
	CS4(int num1,int num2)//constructor with 2 parameter
	{
		a=num1;
		b=num2;
		System.out.println("Running constructor with two parameter");
	}
	CS4(int num1,int num2,int num3)//constructor with three parameter
	{
		a=num1;
		b=num2;
		c=num3;
		System.out.println("Running constructor with three parameter");
		
	}
	public static void main(String[] args)
	{
		CS4 ob1=new CS4();//created object
	    ob1.add();
	    CS4 ob2=new CS4(30);//created object for one parameter constructor
	    ob2.add();
		CS4 ob3=new CS4(20,30);//created object for two parameter constructor
		ob3.add();
		CS4 ob4=new CS4(10,20,30);//created object for three parameter constructor
		ob4.add();
	}
	public void add() 
	{
		int sum=a+b+c;
		System.out.println("Additiion is:"+sum);
	}

}
