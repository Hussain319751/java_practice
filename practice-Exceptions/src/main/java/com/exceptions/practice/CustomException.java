package com.exceptions.practice;

public class CustomException extends Exception{
	public CustomException(String string) {
		System.out.println(string);
	}

	@Override
	public String toString() {
		
		return super.toString()+"thrown by custom";
	}
	
	@Override
	public String getMessage() {
		
		return super.getMessage();
	}
}

