/*
 * Author: Vignan Uppugandla
 * This is the Util class under util package used to read 
 * the text file with student quiz scores. This class also instantiates the Scored Student array of objects
 */

package util;

import java.io.*;
import java.util.StringTokenizer;

import exceptions.*;
import model.*;

public class Util {
	
	public Util(){};
	
	public static ScoredStudent[] readFile(String fileName, ScoredStudent[] student){
		try{
			//reading the file
			FileReader file = new FileReader(fileName);
			BufferedReader br = new BufferedReader(file);
			
			boolean eof = false;
			br.readLine();//ignoring the header line
			
			int i =0;
			
			while(!eof){
				int sID=0;
				int scores[]=new int[5];				
				String line = br.readLine();
				
				//conditional statement to check if the number of students are more than 40
				if(i==40 & line!=null) throw new moreStudentsException("Error: more than 40 students detected");
				else if(i<=40 & line == null){//condition to end the file
					eof = true;
					continue;
				}
				else {
					//tokenize the line and instantiate the ScoredStudent object
					StringTokenizer st = new StringTokenizer(line);
					sID = Integer.parseInt(st.nextToken());				
					int j=0;
					while (st.hasMoreTokens()) {
						if(j==5) throw new moreQuizesException("Error: more than 5 quizes detected");
						else scores[j]=Integer.parseInt(st.nextToken());
						j++;
					}
				}
				student[i] = new ScoredStudent(sID, scores);
			i++;
			}
		br.close(); //close the buffered reader
		} catch(moreStudentsException | moreQuizesException | IOException e){//customs and common exceptions
			System.out.println(e.getMessage());
			System.exit(1);//exit the program run on the exception
		}finally{
		}
		return student;
	}
}
