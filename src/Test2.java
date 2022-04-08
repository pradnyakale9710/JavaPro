
public class Test2 {

	public static void main(String[] args) {
		Var_call ob2=new Var_call();//creating object 
		System.out.println("Value of variable is:"+ob2.a);//calling non static variable from another class
        System.out.println("value of variable is:"+Var_call.b);//calling static variable from another class
        System.out.println("Value of variable is:"+ob2.name);//calling non-static variable from another class
         
	}

}
