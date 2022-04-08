package Method;

public class Velocity {

	public static void main(String[] args) {
		
     Velocity ob1=new Velocity();//calling non static method need to create object//creating object
     ob1.Test1();//calling non static method using object in the same class
	}
	public void Test1()//non static method becuase it dont have static keyword
	{
		System.out.println("this is a non static method");
	}
	

}
