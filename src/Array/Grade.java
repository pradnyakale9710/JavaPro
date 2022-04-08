package Array;

public class Grade {

	public static void main(String[] args) {
		char Grade[]=new char[4];
		Grade[0]='A';
		Grade[1]='B';
		Grade[2]='C';
		Grade[3]='D';
		System.out.println("by using For loop in Array");
		for(int i=0;i<=3;i++)
		{
			System.out.println(Grade[i]);
		}
		System.out.println("by using while loop in array");
	    char i=0;
	    while(i<=3)
	    {
	    	System.out.println(Grade[i]);
	    	i++;
	    }
	    
	    
	    System.out.println("by using do while loop");
	    char j=0;
	    do
	    {
	    	
	    	System.out.println(Grade[j]);
	    	j++;
	    	
	    }while(j<=3);
	    
	}

}
