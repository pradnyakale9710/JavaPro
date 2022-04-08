package Casting;

public class Child extends Father{

	public static void main(String[] args) {
		Child ob=new Child();
		ob.money();
		ob.bike();
		//Up casting
		Father f=new Child();
		f.money();
		//f.bike();//we can not call without common method 
	}
	
	public void money()//overriding money method
	{
		System.out.println("child class money method");
	}
	public void bike()
	{
		System.out.println("call child class bike method");
	}

}
