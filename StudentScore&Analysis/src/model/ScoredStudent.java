/*
 * Author: Vignan Uppugandla
 * This is the Scored Student class which extend the abstract Student class
 */
package model;
	 
public class ScoredStudent extends Student {
	private int scores[] = new int[5];	
	
	public ScoredStudent(){}//default constructor
	
	public ScoredStudent(int sID, int[] scores){//parameterized constructor
		super(sID);
		this.scores = scores;
	}
	
	//getter and setter for scores
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores){
		this.scores=scores;
	}
	
	//getter and setter to get and set ind values of the scores
	public int getIndScore(int position){
		return scores[position];
	}
	public void setIndScores(int score, int position) {
		this.scores[position] = score;
	}
	
	//overriding the studentReport method of abstract class
	@Override
	public void studentReport(){
		System.out.print(getSID()+"\t");
		for(int score : scores){
			System.out.print("\t"+score);
		}
		System.out.println();
	}
}