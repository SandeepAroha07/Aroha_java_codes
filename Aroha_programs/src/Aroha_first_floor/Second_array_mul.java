package Aroha_first_floor;

import java.util.Scanner;

public class Second_array_mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj = new Scanner(System.in);
			int start;
			int end;
			int n;
			System.out.println("Please enter a start number");
			start = obj.nextInt();
			System.out.println("Please enter an end number");
			end = obj.nextInt();
			System.out.println("Please enter a num number");
			n = obj.nextInt();
			
			 multiply(n,start,end);
			
			

	}

	private static void multiply(int n, int start, int end) {
		// TODO Auto-generated method stub
		for(int i=start;i<=end;i++)
		{
			int temp=0;
		 temp=i*n;
		System.out.println(temp);
		
	}

}
}