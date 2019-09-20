package Aroha_first_floor;

public class Sixth_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
        int max = 0;
        int min = 0;
        // Creating array of grade values
        int[] num = new int[] {
            82, 70, 99, 90, 92, 75, 87, 85, 91, 100, 91, 87 
        };
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            if (min > num[i]) {
                min = num[i];
            }
            if (max < num[i]) {
                max = num[i];
            }
          
	        
        double average = (double) sum / num.length;
        System.out.printf("    min:  " + min);
        System.out.printf("%n    max:  " + max);
        System.out.printf("%naverage:  %.1f", average);
        System.out.printf("    sum:  " + sum);
  
	}

	}

}
