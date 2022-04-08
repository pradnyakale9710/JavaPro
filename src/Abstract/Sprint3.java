package Abstract;

public abstract  class Sprint3 extends Sprint2 {

	
	public abstract void Lonas();
	public abstract void Bill_Payment();
	@Override
	public void offers()
	{
		System.out.println("this is offers method in Sprit3 class");
		
	}
	@Override
	public void EMI() 
	{
		System.out.println("this is EMI method in Sprint3 class");
		
	}
	@Override
	public void UPI_Transper()
	{
      System.out.println("this is UPI transper method in Sprint3 class");
	}
}
