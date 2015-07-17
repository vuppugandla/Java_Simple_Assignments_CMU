/*
 * Author: Vignan Uppugandla
 * This is the abstract Student class
 */
package model;

public abstract class Student{
	private int SID;//student id
	
	public Student(){}//default constructor
	
	public Student(int SID){//parameterized constructor
		this.SID=SID;
	}
	//getter and setter for student id
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	//abstract studentReport method
	public abstract void studentReport();
}	