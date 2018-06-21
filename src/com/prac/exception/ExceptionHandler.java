package com.prac.exception;

public class ExceptionHandler {

	public static void main(String[] args) {
		
		if(true) {
		try {
			System.out.println("In Try");
			
			
		}catch(Exception e) {
			System.out.println("In Catch");
		}finally {
			System.out.println("In Finally");
		}
	}
	}

}
