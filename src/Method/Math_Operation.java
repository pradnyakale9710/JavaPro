package Method;

public class Math_Operation {
	  
	  public void addition()
	  {
		  int a=10;
		  int b=20;
		  int sum=a+b;
		  System.out.println("Addition is: "+sum);
		  
	  }
	  public static void main(String[] args)
	  {
			Math_Operation ob1=new Math_Operation();//created object
			ob1.addition();//calling non-static method in the same class
			ob1.subtraction();//calling static method in the same class
	  }
	  public static void subtraction()
	  {
		  int a=20;
		  int b=30;
		  int sub=a-b;
		  System.out.println("Substraction is: "+sub);
	  }
	

}
