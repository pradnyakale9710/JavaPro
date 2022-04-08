package Method;

public class Demo2 {

	public static void main(String[] args) {
	
		//creating class object//syntax for static method within class
        //creating object
		//syntax:classname objectname=new classname();
		Demo2 ob1=new Demo2();//creating object
		ob1.Test1();//non static method call within class     
		Demo3 ob2=new Demo3();//non static method call from another class
		ob2.Test2();
		
	}
	//syntax:static method
	//public static void methodname();
	public void Test1()//non-static method defination/declaration
	{
		System.out.println("this is non static Test1 method");
	}

}
