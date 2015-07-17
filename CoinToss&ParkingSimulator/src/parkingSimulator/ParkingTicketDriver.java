/*
 * Author: Vignan Uppugandla
 * This is the driver class with the main function, for creating object 
 * for ParkedCar, ParkingMeter, PoliceOfficer and ParkingTicket classes
 */
package parkingSimulator;

public class ParkingTicketDriver {

	public static void main(String[] args) {
		//car1
		System.out.println("Car1:: Purchased Minutes-60, Parked Minutes-58");
		ParkedCar car1 = new ParkedCar("Tesla","S","Black","12ABCD",58);
		ParkingMeter car1Meter = new ParkingMeter(60);
		PoliceOfficer officer1 = new PoliceOfficer("Vignan","123456");
		System.out.println("Finable Minutes: "+officer1.checkCarTime(car1,car1Meter));		
		ParkingTicket car1Ticket = officer1.issueTicket(car1, car1Meter);
		System.out.println(car1Ticket.getTicket());
		
		System.out.println();
		//car2
		System.out.println("Car2:: Purchased Minutes-60, Parked Minutes-60");
		ParkedCar car2 = new ParkedCar("Toyota","Corolla","Red","ABCD12",60);
		ParkingMeter car2Meter = new ParkingMeter(60);
		System.out.println("Finable Minutes: "+officer1.checkCarTime(car2,car2Meter));
		ParkingTicket car2Ticket = officer1.issueTicket(car2, car2Meter);
		System.out.println(car2Ticket.getTicket());
		
		System.out.println();
		//car3
		System.out.println("Car3:: Purchased Minutes-60, Parked Minutes-63");
		ParkedCar car3 = new ParkedCar("Nissan","Altima","White","AB12CD",63);
		ParkingMeter car3Meter = new ParkingMeter(60);
		System.out.println("Finable Minutes: "+officer1.checkCarTime(car3,car3Meter));
		ParkingTicket car3Ticket = officer1.issueTicket(car3, car3Meter);
		System.out.println(car3Ticket.getTicket());
		
		System.out.println();
		//car4
		System.out.println("Car4:: Purchased Minutes-60, Parked Minutes-124");
		ParkedCar car4 = new ParkedCar("Land Rover","Evoque","Brown","A1B2CD",124);
		ParkingMeter car4Meter = new ParkingMeter(60);
		System.out.println("Finable Minutes: "+officer1.checkCarTime(car4,car4Meter));
		ParkingTicket car4Ticket = officer1.issueTicket(car4, car4Meter);
		System.out.println(car4Ticket.getTicket());
		
		System.out.println();
		//car5
		System.out.println("Car5:: Purchased Minutes-0, Parked Minutes-0");
		ParkedCar car5 = new ParkedCar("BMW","X3","Grey","A1BC2D",0);
		ParkingMeter car5Meter = new ParkingMeter(0);
		System.out.println("Finable Minutes: "+officer1.checkCarTime(car5,car5Meter));
		ParkingTicket car5Ticket = officer1.issueTicket(car5, car5Meter);
		System.out.println(car5Ticket.getTicket());
	}
}