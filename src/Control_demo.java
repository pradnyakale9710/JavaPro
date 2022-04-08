
public class Control_demo {

	public static void main(String[] args) {
		
		Control_demo ob1=new Control_demo();
		ob1.days();
		

	}
	public void days()
	{
		int no=3;
		if(no==1)
		{
			System.out.println("sunday");
		}
		else if(no==3)
		{
			System.out.println("monday");
		}
		else if(no==3)
		{
			System.out.println("tuesday");
		}
		else if(no==4)
		{
			System.out.println("wednesday");
		}
		else if(no==5)
		{
			System.out.println("thursday");
		}
		
		else if(no==6)
		{
			System.out.println("friday");
		}
		else if(no==7)
		{
			System.out.println("saturday");
		}
		else
		{
			System.out.println("Invalid choice");
		}
		
	}

}
