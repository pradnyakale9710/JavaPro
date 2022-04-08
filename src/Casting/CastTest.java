package Casting;

public class CastTest {

	public static void main(String[] args) {
		//implicit casting
		
		int a=10;//(4 byte type data type---lower)
		System.out.println("value of a is:"+a);
		double b=a;//(8 byte type data type---higher)
		System.out.println("value of b is:"+b);
		
		//explicit casting 
		double c=10.1234;//(8 byte type data type---higher)
		System.out.println("value of c is:"+c);
		int d=(int)c;//(4 byte type data type---lower)
		System.out.println("value of d is:"+d);
		
	}
	
}
