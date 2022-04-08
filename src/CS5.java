
public class CS5 {
	int a;//variable declaration
	int b;//variable declaration
	
	CS5(int num1,int num2)
	{
		a=num1;
		b=num2;
		System.out.println("this is two parameter constructor");
	}

	public static void main(String[] args) 
	{
	  CS5 ob1=new CS5(20,3);
	  ob1.multi();

	}
	public void multi()
	{
		int mul=a*b;
		System.out.println("multiplication is:"+mul);
	}

}
