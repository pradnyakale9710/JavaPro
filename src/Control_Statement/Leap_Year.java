package Control_Statement;

public class Leap_Year {
	public static void main(String[] args) {
		int year=2000;
       if(year%4==0) 
       {
    	  System.out.println("this is leap year1"); 
    	  if(year%100==0) 
    	  {
    		System.out.println("this is leap year2");  
    	  if(year%400==0)
    	  {
    		  System.out.println("this is leap year3 ");
    	  }
    	  else
    	  {
    		  System.out.println("this is not leap year3");
    	  }
    	 }
    	  else
    	  {
    		  System.out.println("this is not leap year2");  
    	  }
       }
       else
       {
    	
    	   System.out.println("this is not leap year 1");
    	  
       }
       
       
	}

}
