package Aroha_first_floor;

public class Top_2_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1 = 90;
		int sub2 = 85;
		int sub3 = 75;
		int sub4 = 88;
		
		int tmp;
		if (sub1 > sub2)
		{ 
			tmp = sub1; sub1 = sub2; sub2 = tmp; 
			}
		if (sub3 > sub4) 
		{
			tmp = sub3; sub3 = sub4; sub4 = tmp;
			}
		if (sub1 > sub3)
		{
			tmp = sub1; sub1 = sub3; sub3 = tmp; 
			}
		if (sub2 > sub4) 
		{
			tmp = sub2; sub2 = sub4; sub4 = tmp; 
			}
		if (sub2 > sub3) 
		{
			tmp = sub2; sub2 = sub3; sub3 = tmp; 
			}
		System.out.println("Second Highest number is"+sub3);
		System.out.println("first  Highest  number is "+sub4);


	}

}
