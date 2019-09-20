package Aroha_first_floor;

public class ODDnumber_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = { 71,75,22,52,8,49,13,-44,32,99,56,23,67,90,121,88,90};
		int count_neg=0;
		int count_div6and7=0;
		int count_oddnumber=0;
		int count_369_by4=0;
		
		
		for(int i=0; i < c.length ; i++)

		{

		if(c[i] % 2 != 0)
			
		{

		System.out.println(c[i]+" :odd number ");
		count_oddnumber++;

		}
		if (c[i]<0)
		{

			
			count_neg++;
			
		  
		
		}
		
		
		if (c[i] % 6 == 0 && c[i]%7==0)

		{

			System.out.println(c[i]+" :divisible by 6 and 7 ");

			count_div6and7++;

			}
		
		if(i==3||i==6||i==9)
		{
			
			if (c[2] % 4 == 0)

			{

			System.out.println("3rd  or 4th or 5th element divisible by 4"+ c[i]);
			count_369_by4++;

			}
		}
		
		
		
		
	}
		
		
		
	    System.out.println("odd numbers are " +count_oddnumber );	
	    System.out.println("Neg numbers are"  + count_neg );
		System.out.println("Number are dividsble by 6 or 7 "+count_div6and7);
		System.out.println("number are divisble by 4 in 369 postion are "+ count_369_by4);
		
	}

}
