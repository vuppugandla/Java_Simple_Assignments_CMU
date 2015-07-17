/*
 * Author: Vignan Uppugandla
 * This is the driver class with the main function, for creating objects 
 */
package driver;

import model.*;
import util.Util;

public class Driver {

	public static void main(String[] args) {
		//Testing the output
		
		//creating student object
		ScoredStudent[] student1 = new ScoredStudent[40];
		
		//reading file with student scores
		/*File Names used for testing the output
		*Normal Functioning: StudentScores.txt
		*More than 40 Students: Students46.txt
		*More than 5 quizes: Quizes6.txt
		*6Quizes+46Students(6 quizes before 40 students): Quizes6Students46.txt
		*6Quizes+46Students(6 quizes after 40 students): Students46Quizes6.txt
		*file doesnot exist: random.txt*/
		student1 = Util.readFile("StudentScores.txt",student1);
		
		//calculating statistics
		Statistics stats1 = new Statistics(student1);
//		stats1.findLowScores(student1);
//		stats1.findHighScores(student1);
//		stats1.findAvgScores(student1);
		
		//generating report
		System.out.println("Stud\t\tQ1\tQ2\tQ3\tQ4\tQ5");
		//student scores
		for(int i=0;i<40;i++){
			if(student1[i]==null){
				i=student1.length;
				continue;
			}
			student1[i].studentReport();
		}
		System.out.println();
		
		//score statistics
		stats1.classReport();
	}
}