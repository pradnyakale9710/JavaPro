package Practice_Programmes_imp;



public class Armstrong_Using_for {

	public static void main(String[] args) 
	{
		int no=153,temp=0,sum=0;
		 int no1=no;
		while(no1!=0)
		{
			temp=no1%10;
			sum=sum+(temp*temp*temp);
			no1=no1/10;
			
		}
		if(sum==no)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
	}

}
