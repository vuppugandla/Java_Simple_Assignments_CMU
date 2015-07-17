/*
 * Author: Vignan Uppugandla
 * This class is storing the details of the police officer and
 * checking if the car parked exceeded the parking minutes limit and
 * if it did issue a ticket
 */
package parkingSimulator;

public class PoliceOfficer {
	private String officerName;
	private String badgeNumber;
	
	//default constructor
	public PoliceOfficer(){}
	
	//constructor to initialize officer name and badge number
	public PoliceOfficer(String officerName, String badgeNumber){
		this.officerName=officerName;
		this.badgeNumber=badgeNumber;
	}
	
	public String getOfficerName(){
		return officerName;
	}
	public void setOfficerName(String officerName){
		this.officerName=officerName;
	}
	
	public String getBadgeNumber(){
		return badgeNumber;
	}
	public void setBadgeNumber(String badgeNumber){
		this.badgeNumber=badgeNumber;
	}
	
	//method to check car parking time, if it exceeded or not
	public int checkCarTime(ParkedCar car, ParkingMeter meter){
		int finableMinutes = car.getParkedMinutes()-meter.getPurchasedMinutes();
		
		if(finableMinutes>0){
			return finableMinutes;
		}else{return 0;}
	}
	
	//method to issue ticket for exceeding the parking time limit
	public ParkingTicket issueTicket(ParkedCar car, ParkingMeter meter){
		ParkingTicket ticket = null;
		int finableMinutes = car.getParkedMinutes()-meter.getPurchasedMinutes();
		
		if(finableMinutes>0){
			ticket = new ParkingTicket(car,this,finableMinutes);
		}else if(car.getParkedMinutes()!=0 && meter.getPurchasedMinutes()!=0 && finableMinutes==0){
			ticket=new ParkingTicket("Right on time - Ticket need not be issued now");
		}else if(car.getParkedMinutes()==0 && meter.getPurchasedMinutes()==0){
			ticket=new ParkingTicket("Parked time is zero, Ticket need not be issued");
		}
		else{
			ticket=new ParkingTicket("This car still has time left on purchased minutes");
		}
	return ticket;
	}
}
