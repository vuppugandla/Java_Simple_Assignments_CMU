/*
 * Coin Class: This class is for checking the side up of the coin
 * 			and also toss the coin
 * Author: Vignan Uppugandla
 */
package coinTossSimulator;

import java.util.Random;

public class Coin {
	private String sideUp;
	
	Random randSideGen = new Random();
	
	//default constructor which recognized the upside upon creation of object 
	public Coin(){
		toss();
	}
	
	public String getSideUp(){
		return sideUp;
	}
	
	public void setSideUp(String sideUp){
		this.sideUp=sideUp;
	}
	//method for tossing the coin
	public void toss(){
		if(randSideGen.nextInt(2)==0){sideUp="Heads";}
		else sideUp="Tails";
	}
}
