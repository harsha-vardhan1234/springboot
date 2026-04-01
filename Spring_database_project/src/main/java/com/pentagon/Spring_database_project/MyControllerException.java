package com.pentagon.Spring_database_project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyControllerException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NullPointerException.class)
//	public void sweet() {
//    	System.out.println("i am harsha");
//    	
//	
//}
    public ResponseEntity<ResponseStructre<String>> nullPointerhandel(NullPointerException e){
    	ResponseStructre<String > rs=new ResponseStructre<String>();
    //	rs.setData("dont deal with  null");
    	rs.setStatuscode(HttpStatus.BAD_REQUEST.value());;
    	rs.setMessage("message"+e.getMessage());
    	return  new ResponseEntity<ResponseStructre<String>>(rs,HttpStatus.BAD_REQUEST);
    }
}
