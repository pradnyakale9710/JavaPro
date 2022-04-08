package Genralisation;

public class TestClass {

	public static void main(String[] args) {
		JIO ob=new JIO();
		ob.Call();
		ob.Sms();
		ob.Data();
		System.out.println("JIO SIM rate is:"+TRAI.sim);
		Airtel ob1=new Airtel();
		ob1.Call();
		ob1.Sms();
		ob1.Data();
		System.out.println("JIO SIM rate is:"+TRAI.sim);
		Vi ob2=new Vi();
		ob2.Call();
		ob2.Sms();
		ob2.Data(); 
		System.out.println("JIO SIM rate is:"+TRAI.sim);
	}

}
