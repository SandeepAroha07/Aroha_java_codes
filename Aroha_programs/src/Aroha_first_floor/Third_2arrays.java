package Aroha_first_floor;

import java.util.Scanner;

public class Third_2arrays {
	static String[] name=new String[3];
	static Float [] avg=new Float[3];
	static String tempname=null;
	static Float tempavg;
	static Float minavg;
	static Float maxavg;
	static Float tempclassavg = 0.0F;
	static Float classavg;
	static int min_count = 0;
	static int max_count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner str=new Scanner(System.in);
		
		
		for(int i=0;i<=name.length-1;i++)
		{
		System.out.println("Enter Student "+ i+"name");
		tempname=str.next();
		name[i]=tempname;
		System.out.println("Enter Student "+ i +" avg");
		tempavg=str.nextFloat();
		avg[i]=tempavg;
		}
		
		for(int i=0;i<=name.length-1
				;i++)
		{
		tempclassavg=tempclassavg+avg[i];
		}
		
		
		
System.out.println("class avearge is"+ tempclassavg);
		classavg=tempclassavg/name.length;
		Minstudent(name, avg);
		Maxstudent(name, avg);
		Maxclasavgstudent(name, avg, classavg);
		
		
		
	
		
		
		for(int i = 1; i <=avg.length-1; i++)
        {
		if(avg[i]>classavg)
		{
			System.out.println("More than class avg student is"+ name[i]+" :"+ avg[i] );
		}
		
        }
	}

	private static void Minstudent(String[] name, Float[] avg) {
		  minavg = avg[0];
	        for(int i = 1; i <=avg.length-1; i++)
	        {
	            if(minavg > avg[i])
	            {
	                minavg = avg[i];
	                min_count=i;
	            }
	        }
			System.out.println("Lowest average student is "+ name[min_count]+ ":" +  minavg);
			
			
	
		
	}

	private static void Maxstudent(String[] name, Float[] avg) {
		
		 maxavg = avg[0];
	        for(int i = 1; i <=avg.length-1; i++)
	        {
	            if(maxavg < avg[i])
	            {
	                maxavg = avg[i];
	                 max_count = i;
	            }
	        }
			System.out.println("Highest average student is "+ name[max_count]+ ":" +  maxavg);
		
		
	}
	
	private static void Maxclasavgstudent(String[] name, Float[] avg,Float classavg) {
		
		for(int i = 1; i <=avg.length-1; i++)
        {
		if(avg[i]>classavg)
		{
			System.out.println("More than class avg student is"+ name[i]+" :"+ avg[i] );
		}
		
        }
	}
		
		
	}
	
	
	
	

