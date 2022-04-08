
public class Captcha_demo{

	public static void main(String[] args) {
		
		String username="pradnya";
		String pass="pk@123";
		String captcha="1234";
		if(username=="pradnya")
		{
			System.out.println("your username is correct plz enter passworld");
			if(pass=="pk@123")
			{
				System.out.println("Your passsword is correct plz enter captcha");
			 
		      if(captcha=="1234")
		      {
			   System.out.println("your login successfully");  
		      }
		      else
		      {
			   System.out.println("Your captcha is incorrect");
		      }
			}
			else
			 {
				System.out.println("Your passworld is incorrect");
			 }
		}
		 else
		 {
		   System.out.println("your username is incorrect"); 	
		 }
		}
		

	}


