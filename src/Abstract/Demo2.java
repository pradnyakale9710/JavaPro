package Abstract;

public class Demo2 extends Demo {

	public static void main(String[] args) {
		Demo2 ob=new Demo2();
		ob.test3();
        ob.test2();
        ob.test1();
	}

	@Override
	public void test3() 
	{
	 System.out.println("this is implemented abstract method");
		
	}
	

}
