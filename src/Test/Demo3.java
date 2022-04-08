package Test;

import Access_Specifier.Demo1;

public class Demo3 extends Demo1 {

	public static void main(String[] args) {
		//Demo1 ob=new Demo1();
		//ob.Test1();//public method we can access outside the package
        
		Demo3 ob1=new Demo3();
		ob1.Test3();//protected method we can access outside the package
		ob1.Test1();//public method we can access outside the package
        
	}

}
