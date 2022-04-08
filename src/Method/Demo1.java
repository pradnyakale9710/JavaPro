package Method;

public class Demo1 {

	public static void main(String[] args) {
		add();//calling static form same class
		sub();
		mul();
		Example1.Test1();//calling static method from another class

	}
	public static void add()//static method becuase it have static keyword
	{
		System.out.println("this is addition method");
	}
	public static void sub()
	{
		System.out.println("this is subtraction method");
	}
	public static void mul()
	{
		System.out.println("this is multiplication method");
	}

}
