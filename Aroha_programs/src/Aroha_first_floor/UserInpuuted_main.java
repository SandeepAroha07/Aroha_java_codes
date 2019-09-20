package Aroha_first_floor;
import java.util.Scanner;
public class UserInpuuted_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("User enter how many Iterations u need"
				+ "ed");
		int iter=s.nextInt();
		User_without_main uw=new User_without_main();
		int[] a=uw.acceptNum(iter);
		
		 uw.sumandavg(a);
	int max=uw.highestnum(a);
	int min=uw.lowestnum(a);
	uw.printhighest(max);
	uw.printlowest(min);
		 
		
	

	}

}
