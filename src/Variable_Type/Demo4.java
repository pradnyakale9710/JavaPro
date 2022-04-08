package Variable_Type;

public class Demo4 {
	static int a = 5;// global static variable
    static float r=10.6f;//static global variable
	public static void main(String[] args) {

		Demo4 ob1 = new Demo4();
		ob1.sub();// called non-static method within same class

		area();

	}

	public static void area() {
		float pi = 3.14f;
		float area1 = pi * r * r;
		System.out.println("Area of circle is:" + area1);
	}

	public void sub() {
		int c = 10;
		int sub1 = c - a;// global static variable used here
		System.out.println("substraction is" + sub1);
	}

}
