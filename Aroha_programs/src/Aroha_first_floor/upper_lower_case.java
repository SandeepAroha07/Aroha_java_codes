package Aroha_first_floor;

import java.util.Scanner;



public class upper_lower_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the name");
		
		String s1=s.next();
		int len=s1.length();
		int upcount=0;
		int locount=0;
		int speccount=0;
		
		
		char c;
		
          for(int i=0;i<=len-1;i++)
          {
        	 c=s1.charAt(i);
        	 if(c>='A'&&c<='Z')
        	 {
        		 
        		 upcount++;
        		 speccount++;
        		 
        	 }
        	 if(c>='a'&&c<='z')
        	 {
        		 
        		 locount++;
        		 speccount++;
        		 
        	 }
        	        	  
        	
        	  
        	  
        	  
        	  
        	  
          }
		
		
		System.out.println("number of uppercase are"+  upcount);
		
		System.out.println("number of lower case are"+  locount );
		
		System.out.println("number of special  are"+ speccount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
