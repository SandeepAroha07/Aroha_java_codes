package Aroha_first_floor;

public class Seventh_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r=3;
		double h=5;
		double pie=(22.0/7.0);
		double onethird=(1.0/3.0);
		double volume=(onethird*pie*r*h);
		double length= Math.sqrt((r*r)*(h*h));
		double lateral_surface_area=((pie*r*r)+(pie*r*length));
		System.out.println("volume of the cone is:" +volume);
		System.out.println("lateral surface area of the cone is:" +lateral_surface_area);
		System.out.println(length);

	}

}
