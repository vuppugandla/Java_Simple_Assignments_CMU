/*
 * Author: Vignan Uppugandla
 * This class is used for calculating the fine amount and
 * generating the parking ticket, if the vehicle exceeded
 * the purchased minutes limit
 */
package parkingSimulator;

import java.lang.Math;

public class ParkingTicket {
	private static final double BASE_FINE = 25.00;
	private static final double ADD_FINE_PER_HOUR = 10.00;
	private int finableMinutes;
	private String ticket;
	
	private ParkedCar car;
	private PoliceOfficer officer;
	
	//default constructor
	public ParkingTicket(){}
	
	//Constructor with only ticket as parameter
	public ParkingTicket(String ticket){
		this.ticket=ticket;
	}
	
	//constructor to initialize car, officer and finable minutes
	public ParkingTicket(ParkedCar car, PoliceOfficer officer, int finableMinutes){
		this.car=car;
		this.officer=officer;
		this.finableMinutes=finableMinutes;
		calculateFine();
	}
	
	public String getTicket(){
		return ticket;
	}
	
	public void setTicket(String ticket){
		this.ticket=ticket;
	}
	
	//method to calculate fine
	public void calculateFine(){
		
		int finableHours=(int)(Math.ceil(finableMinutes/60.0));
		double totalFine = BASE_FINE + (ADD_FINE_PER_HOUR*(finableHours-1));
		
		ticket = "Make: "+car.getMake()+
				"\nModel: "+car.getModel()+
				"\nColor: "+car.getColor()+
				"\nLicense Number: "+car.getLicenceNumber()+
				"\nParked Minutes: "+car.getParkedMinutes()+
				"\nFinable Minutes: "+finableMinutes+
				"\nOfficer Name: "+officer.getOfficerName()+
				"\nOfficer Badge Number: "+officer.getBadgeNumber()+
				"\nFine Amount: "+totalFine;
	}
}
