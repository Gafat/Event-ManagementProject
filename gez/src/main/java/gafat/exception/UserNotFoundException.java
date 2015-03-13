package gafat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(value= HttpStatus.NOT_FOUND,	reason="No such userName Found")

public class UserNotFoundException extends RuntimeException  {
	
	private String message= "No such userName is Found. Please login with correct credentials or do new registration. ";
         
	public  UserNotFoundException()
        {
	
	     }
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}
