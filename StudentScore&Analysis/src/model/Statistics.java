/*
 * Author: Vignan Uppugandla
 * This is the Statistics class which implements IStatistics interface
 */
package model;

import java.text.DecimalFormat;

public class Statistics implements IStatistics{
	//int array variables
	private int lowScores[] = new int[5];
	private int highScores[] = new int[5];
	private float avgScores[] = new float[5];
	
	public Statistics(){};
	
	public Statistics(ScoredStudent[] student){
		findLowScores(student);
		findHighScores(student);
		findAvgScores(student);
	}
	
	public int[] getLowScores() {
		return lowScores;
	}

	public void setLowScores(int[] lowScores) {
		this.lowScores = lowScores;
	}

	public int[] getHighScores() {
		return highScores;
	}

	public void setHighScores(int[] highScores) {
		this.highScores = highScores;
	}

	public float[] getAvgScores() {
		return avgScores;
	}

	public void setAvgScores(float[] avgScores) {
		this.avgScores = avgScores;
	}

	//calculating low scores
	@Override
	public void findLowScores(ScoredStudent[] student){
		
		for (int i=0; i<lowScores.length; i++){
			for (int j = 0; j < student.length; j++) {
				
				if(student[j]==null){
					j=student.length;
					continue;
				}
				
				if(j == 0 ) lowScores[i]=student[j].getIndScore(i);
				else if(lowScores[i] > student[j].getIndScore(i)) lowScores[i]=student[j].getIndScore(i);
			}
		}
	}
	
	//calculating high scores
	@Override
	public void findHighScores(ScoredStudent[] student){
		for (int i=0; i<highScores.length; i++){
			for (int j = 0; j < student.length; j++) {
				
				if(student[j]==null){
					j=student.length;
					continue;
				}
				
				if(j == 0) highScores[i]=student[j].getIndScore(i);
				else if(highScores[i] < student[j].getIndScore(i)) highScores[i]=student[j].getIndScore(i);
			}
		}
	}
	
	//calculating avg scores
	@Override
	public void findAvgScores(ScoredStudent[] student){
		int numberOfStudents = 40;
		for (int i=0; i<avgScores.length; i++){
			for (int j = 0; j < student.length; j++) {
				
				if(student[j]==null){
					numberOfStudents = j;
					j = student.length;
					continue;
				}
				avgScores[i] += student[j].getIndScore(i);
			}
		avgScores[i] = avgScores[i]/numberOfStudents;
		}
	}
	
	//printing the class statistics report
	@Override
	public void classReport(){
		DecimalFormat df = new DecimalFormat("0.#");
		System.out.print("Low Score");
		for(int score: lowScores){
			System.out.print("\t"+score);
		}
		System.out.println();
		System.out.print("High Score");
		for(int score: highScores){
			System.out.print("\t"+score);
		}
		System.out.println();
		System.out.print("Average"+"\t");
		for(float score: avgScores){
			System.out.print("\t"+df.format(score));
		}
		System.out.println();
	}
}
