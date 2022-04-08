
public class Constructor {
	
	//Default constructor is call by compiler at the time of compilation

	public static void main(String[] args) {
		
		Constructor ob1=new Constructor();//creating object
		ob1.Test1();//calling non static 
	}
	public void Test1()//non static method defination
	{
		System.out.println("this is test1 method");
		
	}

}
