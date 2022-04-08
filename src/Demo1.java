
public abstract class Demo1 {

	public static void main(String[] args) {
		test1();//static method call within same class

	}
	public static void test1()
	{
		System.out.println("this is test1 method");
	}
	public void test2()
	{
		System.out.println("this is public test2 method");
	}
	public abstract void test3();
	
	

}
