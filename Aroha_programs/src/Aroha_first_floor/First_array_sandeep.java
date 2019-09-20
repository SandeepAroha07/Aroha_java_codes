package Aroha_first_floor;

import java.util.Arrays;

public class First_array_sandeep {

static	int count=0;
static int temp=0;
static int tempavg=0;
static int max=0;
static int min=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,4,55,10,34,12,10,19,199,49}; 
		int len=arr.length;
		
		int highest=highest(arr,len);
		int lowest=Lowest(arr,len);
		Arrays.sort(arr);
	//	System.out.println(arr[0]);
		int n = 10; 
		boolean test = false; 
		int firsthalflen=arr.length/2;
		
	
	
		
	int result=	checknumberpresentornot(arr,n);
	int sum =firsthalfsumandavg(arr,firsthalflen);
	int avg=firsthalfavg(sum,firsthalflen);
	
	if(result>1)
	{
		test=true;
		System.out.println("Number is present: "+ n);
		System.out.println("number of repeated" + result);
		
	}
		
	
    System.out.println("sum of first half is"+ sum);	
    System.out.println("sum of avg is "+ avg);
    System.out.println("highest is "+highest );
    System.out.println("Lowest is" + lowest);
		
		
	}

	private static  int checknumberpresentornot(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i]==n)
{
 
		count++;		
				
}
		
			
			
		}
		return count;
		
		
		
	}

	
	
	
	
	
	private static int firsthalfsumandavg(int[] arr, int firsthalflen)
	{
		
		for(int i=0;i<=firsthalflen-1;i++)
		{
			
		 temp=temp+arr[i];
		}
		return temp;
		
		
	}

	
	private static int firsthalfavg(int sum, int firsthalflen)
	{
		
		
		tempavg=sum/firsthalflen;
		return tempavg;
		
		
		
		
	}
	
	public static int highest(int[] arr,int len)
	{
		
		
		
		 max = arr[0];
		for(int i = 1; i <len-1;i++)
		{
			if(!(i==2||i==3))
				
			{			
			if(arr[i] > max)
			{
				max = arr[i];
			}
			}
		}
	
		
		
		
		
		
		
		
		

		return max;

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int Lowest(int[] arr,int len)
	{
		
		
		
		 max = arr[0];
		for(int i = 1; i <len-1;i++)
		{
			if(!(i==2||i==3))
				
			{			
			if(arr[i] < max)
			{
				min = arr[i];
			}
			}
		}
	
		
		
		
		
		
		
		
		

		return min;

}
	
	
	
	
}
