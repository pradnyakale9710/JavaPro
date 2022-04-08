package Array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		//array declaration
		//Datatype Arrayname[]=new Datatype[size];
		
		char Grade[]=new char[6];
	    
		//array intilization
		//Arrayname[index]=value;
		//int i;
		Grade[0]='B';
		Grade[1]='A';
		Grade[2]='C';
		Grade[3]='e';
		Grade[4]='D';
		Grade[5]='f';
//		for(int i=0;i<=5;i++)
//		{
//		  System.out.println(Grade[i]);	
//		}
		//max index=length-1
		//leg=6-1=5
//		for(int i=0;i<=Grade.length-1;i++)
//		{
//			System.out.println(Grade[i]);
//		}
//		System.out.println("**print array by using ascending order**");
        Arrays.sort(Grade);
	    for(int i=0;i<=Grade.length-1;i++)
		{
			
			System.out.println(Grade[i]);
		}
		System.out.println("***Print array by Using Decending order***");
		for(int i=Grade.length-1;i>=0;i--)
		{
			System.out.println(Grade[i]);
		}
	}

}
