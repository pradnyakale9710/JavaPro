package String_Study;

public class reverse {

	public static void main(String[] args) {
		System.out.println("***reverse string by using concatenation(+) operator***");
		String s1="pradnya";
		String rev1="";
		int length=s1.length();
		for(int i=length-1;i>=0;i--)
		{
			rev1=rev1+s1.charAt(i);
		}
		System.out.println("Reverse String is:"+rev1);  

	}

}
