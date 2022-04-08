package Access_Specifier;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Demo1 ob=new Demo1();
		ob.Test();//we can access default method from another class
		ob.Test1();//we can access public method from another class
		//ob.Test2();//we can not access private method of another class
		ob.Test3();//we can access protected method method of another class
		
		System.out.println("Default variable call from another class is:"+ob.a);
		System.out.println("public variable call from another class is:"+ob.b);
		System.out.println("protected variable call from another class is:"+ob.c);
		//System.out.println("private variable call from another class is:"+ob.d);//we can not access private variable from another class
	}

}
