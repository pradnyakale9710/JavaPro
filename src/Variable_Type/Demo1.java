package Variable_Type;

public class Demo1 {
	int A=10;
    static int b=20;
    

	public static void main(String[] args) {
		Demo1 ob1=new Demo1();
		ob1.Sub1();
		
		
		System.out.println("global non static variable: "+ob1.A);
		System.out.println("global static variable: "+b);

	}
	public static void Sub1()
	{
	    int c=30;
		int d=40;
		int sub=b-c;
		System.out.println("substraction is:"+sub);
	}

   }
