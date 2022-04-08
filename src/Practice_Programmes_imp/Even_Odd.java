package Practice_Programmes_imp;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
	    int no=sc.nextInt();
       
     if(no%2==0)
     {
    	System.out.println("number is even"); 
     }
     else
     {
    	System.out.println("number is odd"); 
     }
	
	}
}