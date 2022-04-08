package Method;

public class Demo5 {
	
	int a;//variable declaration
	int b;
	int c;
	
	static int d;
	static int e;
	public Demo5()
	{
		a=10;
		b=20;
		c=30;
		d=30;
		e=50;
		System.out.println("Running User Default constructor with zero paramter");
	}
	public Demo5(int num1,int num2,int num3)
	{
		a=num1;
		b=num2;
		c=num3;
		System.out.println("this is one paraamter constructor");
	}

	
	public static void main(String[] args) {
     
		Demo5 ob1=new Demo5();
		Demo5 ob2=new Demo5(20,10,20);
		Demo5 ob3=new Demo5(30,10,20);
		ob2.mul();
		ob3.mul();
		
	}
	public void mul()
	{
		int m=a*b*c;
		System.out.println("Multiplication is:"+m);
		System.out.println("this is Non static method");
	}
	public static void add()
	{
		//int d=50;
		//int e=40;
		int add=d+e;
		System.out.println("Addition is:"+add);
		System.out.println("this is static method");
		
		
	}

}
