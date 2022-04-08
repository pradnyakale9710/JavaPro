
public class Nested_demo {
	//username is correct then please enter password if your password is correct login is successfully.
	//if your password is wrong then check your password

	public static void main(String[] args) {
		
		String username="pradnya";
		String passworld="pk@123";
        if(username=="pradnya")
        {
        	System.out.println("username is correct please enter passworld");
        	if(passworld=="pk@123")
        	{
        		System.out.println("your login successfully");
        	}
        	else
        	{
        		System.out.println("plz enter valid passworld");
        	}
        
        }
        else
        {
        	System.out.println("Incorrect username please enter valid username");
        }
	}

}
