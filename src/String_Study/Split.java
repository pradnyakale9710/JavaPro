package String_Study;

public class Split {

	public static void main(String[] args) {
		String p2="Good_Morning_All";
        String sep="_"; //on the basis of seprator
        System.out.println("***Split String By using Array ***");
        String output[]=p2.split(sep);
       
        for(int i=0;i<=output.length-1;i++)
        {
    	 System.out.println(output[i]);  
        }
       System.out.println("***Split String By using Array and reverse string ***");
       for(int i=output.length-1;i>=0;i--)
       {
    	 System.out.println(output[i]);  
       }
	}

}
