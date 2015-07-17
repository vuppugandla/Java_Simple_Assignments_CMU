/*
 * Author: Vignan Uppugandla
 * This is the Istatistics interface
 */

package model;

public interface IStatistics {

	//methods that will be overidden by the classes that implemen this interface
	public void findLowScores(ScoredStudent[] student);
	public void findHighScores(ScoredStudent[] student);
	public void findAvgScores(ScoredStudent[] student);
	public void classReport();
}