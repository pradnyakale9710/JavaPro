package Abstract;

public abstract class Sprint2 extends Sprint1{
	
	public abstract void offers();
	public abstract void EMI();
	public abstract void UPI_Transper();
	

	@Override
	public void Money_Abstract_NEFT() 
	{
		System.out.println("this is Money abstract neft method");
		
	}

	@Override
	public void Credit_Status() 
	{
		System.out.println("this is credit status method");
	}

	
}
