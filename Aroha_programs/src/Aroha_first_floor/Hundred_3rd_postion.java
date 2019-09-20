package Aroha_first_floor;

public class Hundred_3rd_postion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		int n=12345;

        int place=0;

 

              {

                  if (place == 1) {

                	  
                      n = n % 10;

                  } else if (place == 10) {

                      n = (n / 10) % 10;

                  } else {

                      n = (n / 100) % 10;

                  }

if (n==3)

{

  System.out.println("the number in hundredth place is: 3");



}

else

{

  System.out.println("the number in hundredth place is  not matched.");

 

}

              }    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
