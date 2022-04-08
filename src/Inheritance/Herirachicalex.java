package Inheritance;

public class Herirachicalex {

	public static void main(String[] args) {
		
		Son1 ob=new Son1();
		ob.money();//calling own  method
		ob.laptop();//calling method from super class
		
		Son2 ob1=new Son2();
		ob1.scooty();//calling own  method
		ob1.laptop();//calling super class method
	

	}

}
