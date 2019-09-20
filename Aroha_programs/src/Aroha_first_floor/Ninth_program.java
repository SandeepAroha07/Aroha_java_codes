package Aroha_first_floor;

public class Ninth_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float speed = 80;
		double time=10.5;
		double total_distance=(speed*time);
		double petrol_for_12km=1.0;
		double petrol_per_km=(petrol_for_12km/12);
		double travel_cost= ((total_distance * petrol_per_km)*75);
		System.out.println("Tolat distance is " +total_distance +"km");
		System.out.println("Tolat petrol requirement is " +(total_distance*petrol_per_km)+"lt");
		System.out.println("Tolat petrol cost is " +travel_cost+"rs");


  
		
		
		
	}

}
