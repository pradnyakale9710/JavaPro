package Task_switch_Control;

public class Grade_demo {

	public static void main(String[] args) {
		char grade='B';
		switch (grade) {
		case 'A':
			   System.out.println("Your marks are>=75");
			break;
		case 'B':
			   System.out.println("Your marks 60-75");
			break;	
		case 'C':
			   System.out.println("Your marks 50-60");
			break;
		case 'D':
			   System.out.println("Your marks 40-50");
			break;
		default:
			System.out.println("your wrong choice");
			break;
		}

	}

}
