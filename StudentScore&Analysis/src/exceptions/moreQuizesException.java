/*
 * Author: Vignan Uppugandla
 * This is custom exception that will be raised when there are more than required quizes
 */

package exceptions;

import java.lang.Exception;

public class moreQuizesException extends Exception{
	private static final long serialVersionUID = 6356873012031128495L;

	public moreQuizesException(){
		super();
	}
	
	public moreQuizesException(String message){
		super(message);
	}
	
	public moreQuizesException(Throwable throwable) {
		super(throwable);
	}
	
	public moreQuizesException(String message , Throwable throwable){
		super(message, throwable);
	}
}