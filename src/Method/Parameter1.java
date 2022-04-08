package Method;

public class Parameter1 {

	public static void main(String[] args) {
		Parameter1 ob1=new Parameter1();
		ob1.studinfo();//call non static method withaout paramter
		ob1.studinfo1("pratik",102,'B',30.10f);//call non-static method with parameter
        addition(2,4);//calling static method within same class
        ob1.sub(4,2);//calling non-static method within same class
	}
	public void studinfo()
	{
		String name="Pradnya";
		int rollno=101;
		char grade='A';
		float weight=70.77f;
		System.out.println("student Name is:"+name);
		System.out.println("student Roll is:"+rollno);
		System.out.println("Student Grade is:"+grade);
		System.out.println("Student weight is:"+weight);
	}
	public void studinfo1(String name,int rollno,char grade,float weight)
	{
		System.out.println("student Name is:"+name);
		System.out.println("student Roll is:"+rollno);
		System.out.println("Student Grade is:"+grade);
		System.out.println("Student weight is:"+weight);
	}
	public static void addition(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Substraction is:"+c);
	}

}
