/*
 * Author: Vignan Uppugandla
 * This class for the generating the number of minutes purchased for parking the car
 */
package parkingSimulator;

public class ParkingMeter {
	private int purchasedMinutes;
	
	//default constructor
	public ParkingMeter(){}
	
	//constructor to initialize purchased minutes for the parked car
	public ParkingMeter(int purchasedMinutes){
		this.purchasedMinutes=purchasedMinutes;		
	}

	public int getPurchasedMinutes(){
		return purchasedMinutes;
	}
	public void setPurchasedMinutes(int purchasedMinutes){
		this.purchasedMinutes=purchasedMinutes;
	}
		
}
