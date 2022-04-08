package Abstract;

public  class Concrete1 extends Sprint3 {

	public static void main(String[] args) 
	{
		System.out.println("______Banking Domain________");
	 Concrete1 ob=new Concrete1();
	 ob.IMPS();
	 ob.Bank_Statement();
	 ob.Account_Activity();
	 ob.Credit_Status();
	 ob.Money_Abstract_NEFT();
	 ob.Credit_Status();
	 ob.EMI();
	 ob.offers();
	 ob.Lonas();
	 ob.Bill_Payment();
	 
	 

	}
	
	@Override
	public void Lonas()
	{
		System.out.println("this is Loans method in Concrete1 class");
		
	}
	@Override
	public void Bill_Payment() 
	{
	System.out.println("this is bill payment method in concrete1 class");
		
	}
	
	
	
	

}
