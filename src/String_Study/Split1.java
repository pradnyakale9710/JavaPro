package String_Study;

public class Split1 {

	public static void main(String[] args) {
		System.out.println("**Split String By using Array**");
		String s2="I:love:My:India";
        String sep=":";
        String arr[]=s2.split(sep);
        for(int i=0;i<=arr.length-1;i++)
        {
        	System.out.println(arr[i]);
        }
	}

}
