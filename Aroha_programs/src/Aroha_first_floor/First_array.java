package Aroha_first_floor;

import java.util.Arrays;

public class First_array {
	
	
	private static void check(int[] arr, int n) 
    { 
int count=0;  
boolean test = false; 
for (int element : arr) { 
if (element == n) { 
test = true; 
                {
	count++;
                }

            } 
        } 

System.out.println("Is " + n
                           + " present in the array: " + test); 
if(test)
		System.out.println("number of times 10 appeared:"+count);
		
	
	else
		System.out.println("there is no 10");


    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int arr[] = {10,4,55,10,34,12,10,19,199,49}; 
		Arrays.sort(arr);
		System.out.println("Sorting Array is :-");
		
		int n = 10; 
		
		
		System.out.println("Array: "
		                           + Arrays.toString(arr)); 
		
		
		
		check(arr, n); 

	}

}
