/*
 * Author: Vignan Uppugandla
 * This class provided details related to the parked car
 * along with number of minutes car has been parked for
 */
package parkingSimulator;

public class ParkedCar {
	private String make;
	private String model;
	private String color;
	private String licenceNumber;
	private int parkedMinutes;
	
	//default constructor
	public ParkedCar(){}
	
	//constructor which initialized the values of the car
	public ParkedCar(String make, String model, String color, String licenceNumber, int parkedMinutes){
		this.make = make;
		this.model=model;
		this.color=color;
		this.licenceNumber=licenceNumber;
		this.parkedMinutes=parkedMinutes;
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	
	public int getParkedMinutes() {
		return parkedMinutes;
	}
	public void setParkedMinutes(int parkedMinutes) {
		this.parkedMinutes = parkedMinutes;
	}

}
