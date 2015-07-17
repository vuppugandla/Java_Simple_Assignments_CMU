/*
 * Simulator Class: This Simulator class with the main function created the required objects
 * for Coin class and triggers the loop for tossing the coin.
 * Author: Vignan Uppugandla
 */

package coinTossSimulator;

public class Simulator {
	
	public static void main(String[] args) {
		int headCount = 0;
		int tailCount = 0;
		
		//coin object
		Coin coin = new Coin();
		System.out.println("Sideup of the Coin initially: "+coin.getSideUp());
		
		System.out.println("Tossing the coin 20 times");
		//loop for tossing the coin 20 times
		for(int i=0;i<20;i++){
			coin.toss();
			if(coin.getSideUp().equals("Heads")){
				System.out.println("Side up after toss: "+coin.getSideUp());
				headCount++;
			}
			else{
				System.out.println("Side up after toss: "+coin.getSideUp());
				tailCount++;
			}
		}
		System.out.println("Number of Heads: "+headCount);
		System.out.println("Number of Tails: "+tailCount);
	}
	
}
