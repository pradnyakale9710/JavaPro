package This;

public class Demo2 {
	
	int a=10;
	int b=20;
	Demo2()//DEfault constructor
	{
		System.out.println("calling Default constructor");
	}
	Demo2(int num1,int num2)
	{
		num1=a;
		num2=b;
	}

	public static void main(String[] args) {
		Demo2 ob=new Demo2();
		ob.add();

	}
	public void add()
	{
		int c=a+b;
		System.out.println("Addition is:"+c);
	}

}
