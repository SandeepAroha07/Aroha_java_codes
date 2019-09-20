package Aroha_first_floor;

import java.util.Scanner;
public class Assignment_four {

public static void prime(int[] array1){
        int count=0;
        for (int i = 0; i < array1.length; i++) {
            boolean isPrime = true;
            if (array1[i] == 1)
                isPrime = false;
            else {
                // check to see if the numbers are prime
                for (int j = 2; j <= array1[i] / 2; j++) {
                    if (array1[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            // print the number
            if (isPrime) {
                System.out.println(array1[i] + " is a prime number in the array ");
            }
            
                if(array1.length == 2) {
                count++;
                }
                System.out.println(count);
                
            }
        }

        public static void main(String[] args) {
        int[] array1 = new int[5];
             Scanner in = new Scanner(System.in);

             System.out.println("Enter the elements of the array: ");
             for (int i = 0; i < 5; i++) {
                 array1[i] = in.nextInt();
             }
           
        
        prime(array1);
}
}
