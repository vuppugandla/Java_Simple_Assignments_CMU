/*
 * Author: Vignan Uppugandla
 * This is the custom exception that will be raised when there are more than 40 students
 */
package exceptions;

import java.lang.Exception;

public class moreStudentsException extends Exception {
	private static final long serialVersionUID = 379744946215940190L;

	public moreStudentsException(){
		super();
	}
	
	public moreStudentsException(String message){
		super(message);
	}
	
	public moreStudentsException(Throwable throwable) {
		super(throwable);
	}
	
	public moreStudentsException(String message , Throwable throwable){
		super(message, throwable);
	}
}
