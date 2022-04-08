package This;

public class Demo1 extends Super1 {
	
	int a=10;
	int b=20;

	public static void main(String[] args) {
		Demo1 ob=new Demo1();
		ob.Test1();

	}
	public void Test1()
	{
		int a=20;
		System.out.println("calling this:"+this.a);
		System.out.println("calling super:"+super.a);
	}

}
