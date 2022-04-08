package Interface;

public class Son implements Father,Mother {

	public static void main(String[] args) {
		Son ob=new Son();
		ob.money();
		ob.love();
		ob.nature();
		ob.rules();
		Father.nature();  //calling Static method from
		Mother.nature();  
		
	}

	public void nature() {
		// TODO Auto-generated method stub
		System.out.println("Mothers nature completed in sun class");
		
   }

	@Override
	public void love() {
		// TODO Auto-generated method stub
		// System.out.println("Mothers love completed in sun class");
		//to call specific default from super interface follow syntax
		//interfacename.super.methodname();
		Father.super.love();//calling default love method from father
		Mother.super.love();//calling default love method from Mother 
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		System.out.println("Fathers money completed in sun class");
	}

	@Override
	public void rules() {
		// TODO Auto-generated method stub
		System.out.println("Fathers rules completed in sun class");
	}
}
