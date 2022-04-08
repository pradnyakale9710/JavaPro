package Access_Specifier;

public class Demo1 {
	
	int a=20;//default global variable
	public int b=40;//public global variable
	protected int c=30;//protected global variable
	private int d=10;//private global variable
	

	public static void main(String[] args) 
	{
		Demo1 ob=new Demo1();
		ob.Test();//Default method call within package  but cannot access outside the package
        ob.Test1();//public can access anywhere or  throughout project
        ob.Test2();//private can access only within class
        ob.Test3();//protected can access within package or we can access outside the package by using inheritance
        
        System.out.println("Default variable is:"+ob.a);
        System.out.println("public variable is:+ob.b");
        System.out.println("protected Variable is:+ob.c");
        System.out.println("private variable is:"+ob.d);
	}
	void Test()
	{
		System.out.println("Default Demo1 method");
	}
	public void Test1()
	{
		System.out.println("public Demo1 method");
	}
	private void Test2()
	{
		System.out.println("private Demo1 method");
	}
    protected void Test3()
    {
    	System.out.println("protected Demo1 method");
    }
}
