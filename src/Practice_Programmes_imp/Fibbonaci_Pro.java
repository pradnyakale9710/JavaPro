package Practice_Programmes_imp;

public class Fibbonaci_Pro {

	public static void main(String[] args) 
	{
		int no=10,f1=0,f2=1,f3=0,i=0;//first number declare 0 and second no declare 1 .
		System.out.println("Fibbonaci series is:");
		while(i<=no)
		{
			System.out.print( f1 + "," );//0
			f3=f1+f2; //0+1=1
			f1=f2;     
			f2=f3;
		
			i++;
			
		}

	}

}
